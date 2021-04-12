package observer.Observers;

import observer.Data;
import observer.IObservable;

import java.util.Objects;

public class LCDDisplay implements IDisplay, IObserver {
    private final IObservable observable;
    private Data data=new Data();
    public LCDDisplay(IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void display() {
        System.out.println("Displaying On LCD...");
        System.out.println("Temperature : "+data.temperature);
    }

    @Override
    public void update() {
        this.data=observable.getData();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LCDDisplay that = (LCDDisplay) o;
        return Objects.equals(observable, that.observable) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(observable, data);
    }
}
