package designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        News news = new News();

        Developer junior = new Developer(QualificationLevel.JUNIOR, DeveloperType.FRONT_END, "Kyrylo");
        Developer middle = new Developer(QualificationLevel.MIDDLE, DeveloperType.BACK_END, "Dmytro");
        Developer senior = new Developer(QualificationLevel.SENIOR, DeveloperType.FULL_STACK, "Bohdan");

        news.addObserver(junior);
        news.addObserver(middle);
        news.addObserver(senior);

        news.setNewsType(NewsType.SPORTS_NEWS);

        news.removeObserver(junior);
        news.removeObserver(middle);

        news.setNewsType(NewsType.FEATURE_NEWS);
    }
}
