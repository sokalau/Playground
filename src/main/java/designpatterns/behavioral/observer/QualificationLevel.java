package designpatterns.behavioral.observer;

enum QualificationLevel {
    JUNIOR("junior"),
    MIDDLE("middle"),
    SENIOR("senior");

    private String name;

    QualificationLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
