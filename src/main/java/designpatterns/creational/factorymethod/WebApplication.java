package designpatterns.creational.factorymethod;

public class WebApplication extends Application {
    WebApplication(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name + " web application";
    }
}
