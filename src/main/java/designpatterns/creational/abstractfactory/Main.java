package designpatterns.creational.abstractfactory;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        SportsClothingFactory factory;
        LongSleeve longSleeve;
        Trousers trousers;

        factory = PumaSportsClothingFactoryMaker.makeFactory(Brand.PUMA);
        longSleeve = factory.makeLongSleeve();
        logger.info(longSleeve);
        trousers = factory.makeTrousers();
        logger.info(trousers);

        factory = PumaSportsClothingFactoryMaker.makeFactory(Brand.NIKE);
        longSleeve = factory.makeLongSleeve();
        logger.info(longSleeve);
        trousers = factory.makeTrousers();
        logger.info(trousers);
    }
}