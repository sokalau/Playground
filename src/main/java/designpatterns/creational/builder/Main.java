package designpatterns.creational.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Developer developer = new Developer.Builder(DeveloperLevel.MIDDLE, true)
                .age(20)
                .experience(1.5)
                .name("Nikita")
                .build();

        logger.info(developer);
    }
}
