package designpatterns.creational.factorymethod;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Application application;
        Developer developer;

        developer = new WebDeveloper();
        application = developer.createApplication("Google Play Music");
        logger.info(application);

        developer = new MobileDeveloper();
        application = developer.createApplication("Google Maps");
        logger.info(application);
    }
}
