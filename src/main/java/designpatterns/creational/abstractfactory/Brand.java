package designpatterns.creational.abstractfactory;

enum Brand {
    PUMA("Puma"),
    NIKE("Nike");

    private String name;

    Brand(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
