package designpatterns.creational.factorymethod;

class WebDeveloper extends Developer {
    WebDeveloper() {
    }

    @Override
    public Application createApplication(String name) {
        return new WebApplication(name);
    }
}
