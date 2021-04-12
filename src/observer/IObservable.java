package observer;

import observer.Observers.IObserver;

public interface IObservable {
    void register(IObserver observer);
    void unregister(IObserver observer);
    void notifyAllObserver();
    Data getData();
}
