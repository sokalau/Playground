package designpatterns.structural.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        logger.info(beverage.getDescription() + " -> $" + beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Aden(beverage);
        logger.info(beverage.getDescription() + " -> $" + beverage.cost());
    }
}
