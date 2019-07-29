package designpatterns.creational.prototype;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        try {
            Athlete tripleJumper = new TripleJumper(1501);
            Athlete clonedTripleJumper = tripleJumper.clone();
            logger.info("Objects equals: {}", tripleJumper.equals(clonedTripleJumper));
        } catch (CloneNotSupportedException e) {
            logger.error(e.getMessage());
        }
    }
}
