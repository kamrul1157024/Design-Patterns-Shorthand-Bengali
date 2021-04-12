package observer;

import observer.Observers.IObserver;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherStation implements IObservable{

    private Data data=new Data();

    Collection<IObserver> observers;

    public WeatherStation()
    {
        observers=new ArrayList<>();
        data.temperature=23;
    }

    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        this.observers.forEach(observer -> observer.update());
    }

    @Override
    public Data getData() {
        return data;
    }

    public void setTemperature(float temperature)
    {
        this.data.temperature=temperature;
        notifyAllObserver();
    }
}
