package designpatterns.creational.singleton;

class SynchronizedAccessorSingleton {
    private static SynchronizedAccessorSingleton instance;

    private SynchronizedAccessorSingleton() {
    }

    static synchronized SynchronizedAccessorSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedAccessorSingleton();
        }
        return instance;
    }
}
