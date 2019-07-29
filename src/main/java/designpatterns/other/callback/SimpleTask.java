package designpatterns.other.callback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class SimpleTask implements Task {
    private static final Logger logger = LogManager.getLogger();

    SimpleTask() {
    }

    @Override
    public void execute() {
        logger.info("Simple task is executing.");
    }
}
