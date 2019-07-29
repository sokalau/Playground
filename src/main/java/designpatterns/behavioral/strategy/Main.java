package designpatterns.behavioral.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        List<Discounter> discounters = Arrays.asList(
                (amount -> amount - amount * 0.9),
                (amount -> amount - amount * 0.8),
                (amount -> amount - amount * 0.7)
        );

        int amount = 25;
        for (Discounter discounter : discounters) {
            logger.info("Discount: {}", discounter.calculateDiscount(amount));
        }
    }
}
