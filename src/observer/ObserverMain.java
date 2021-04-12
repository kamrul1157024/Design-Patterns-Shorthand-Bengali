package observer;

import observer.Observers.LCDDisplay;
import observer.Observers.PhoneDisplay;

public class ObserverMain {


    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation=new WeatherStation();

        LCDDisplay lcdDisplay=new LCDDisplay(weatherStation);
        PhoneDisplay phoneDisplay= new PhoneDisplay(weatherStation);

        weatherStation.register(lcdDisplay);
        weatherStation.register(phoneDisplay);




        Thread weatherStationThread= new Thread(()->{
            for (float temperature = 0.0F; temperature<=50.0F; temperature+=1.0F)
            {
                weatherStation.setTemperature(temperature);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(temperature==4.0F) weatherStation.unregister(phoneDisplay);
            }
        });





        Thread displayThread= new Thread(()->{

            while (true) {
                lcdDisplay.display();
                phoneDisplay.display();
                System.out.flush();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });



        weatherStationThread.start();
        displayThread.start();


        weatherStationThread.join();
        displayThread.join();


    }
}
