package designpatterns.structural.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Composite {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Order order = new Order();

        order.add(new Sneakers(250, 45));
        order.add(new Box(500, Box.Color.BLUE));

        double amount = order.getAmount();
        logger.info("amount: {}", amount);
    }
}
