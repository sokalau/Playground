package designpatterns.behavioral.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        List<Executable> actions = Arrays.asList(
                () -> logger.info("Awesome action is executing."),
                () -> logger.info("Precious action is executing."),
                () -> logger.info("Refined action in executing.")
        );

        for (Executable action : actions) {
            action.execute();
        }
    }
}
