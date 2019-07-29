package designpatterns.creational.factorymethod;

class MobileDeveloper extends Developer {
    MobileDeveloper() {
    }

    @Override
    public Application createApplication(String name) {
        return new MobileApplication(name);
    }
}
