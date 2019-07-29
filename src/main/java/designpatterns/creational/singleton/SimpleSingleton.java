package designpatterns.creational.singleton;

class SimpleSingleton {
    private SimpleSingleton() {
    }

    public static final SimpleSingleton instance = new SimpleSingleton();
}
