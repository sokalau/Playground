package designpatterns.other.callback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Task task = new SimpleTask();
        Callback callback = () -> logger.info("Callback has been done.");
        task.executeWith(callback);
    }
}
