package designpatterns.creational.factorymethod;

class MobileApplication extends Application {
    MobileApplication(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name + " mobile application";
    }
}
