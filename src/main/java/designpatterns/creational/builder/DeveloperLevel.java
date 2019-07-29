package designpatterns.creational.builder;

enum DeveloperLevel {
    JUNIOR("junior"),
    MIDDLE("middle"),
    SENIOR("senior");

    private String name;

    DeveloperLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
