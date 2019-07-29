package designpatterns.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

class News implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private NewsType newsType = NewsType.HARD_NEWS;

    News() {
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this, newsType);
        }
    }

    void setNewsType(NewsType newsType) {
        this.newsType = newsType;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "News";
    }
}
