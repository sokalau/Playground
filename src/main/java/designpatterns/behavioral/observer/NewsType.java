package designpatterns.behavioral.observer;

enum NewsType {
    HARD_NEWS("hard news"),
    SPORTS_NEWS("sports news"),
    FEATURE_NEWS("feature news");

    private String name;

    NewsType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
