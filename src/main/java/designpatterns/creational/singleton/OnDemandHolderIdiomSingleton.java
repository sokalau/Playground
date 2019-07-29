package designpatterns.creational.singleton;

class OnDemandHolderIdiomSingleton {
    private OnDemandHolderIdiomSingleton() {
    }

    static OnDemandHolderIdiomSingleton getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final OnDemandHolderIdiomSingleton instance = new OnDemandHolderIdiomSingleton();
    }
}
