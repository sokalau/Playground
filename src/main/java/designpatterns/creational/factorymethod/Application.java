package designpatterns.creational.factorymethod;

abstract class Application {
    String name;

    Application(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
