package designpatterns.behavioral.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

class Developer implements Observer {
    private static final Logger logger = LogManager.getLogger();

    private QualificationLevel qualificationLevel;
    private DeveloperType developerType;
    private String name;

    Developer(QualificationLevel qualificationLevel, DeveloperType developerType, String name) {
        this.qualificationLevel = qualificationLevel;
        this.developerType = developerType;
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object parameters) {
        logger.info("Parameters changed to {}", parameters);
        logger.info("Observable: {}", observable);
        logger.info("Observer: {}", this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer that = (Developer) o;
        return this.qualificationLevel == that.qualificationLevel &&
                this.developerType == that.developerType &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualificationLevel, developerType, name);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "qualificationLevel=" + qualificationLevel +
                ", developerType=" + developerType +
                ", name=" + name +
                "}";
    }
}
