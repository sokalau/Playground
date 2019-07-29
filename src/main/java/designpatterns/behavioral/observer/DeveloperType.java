package designpatterns.behavioral.observer;

enum DeveloperType {
    FRONT_END("front end"),
    BACK_END("back end"),
    FULL_STACK("full stack");

    private String name;

    DeveloperType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
