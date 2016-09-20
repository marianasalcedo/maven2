package Demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerDemo {

    public void logs() {
        Logger logger = LogManager.getLogger(this.getClass().getName());
        logger.fatal("Fatal log");
        logger.error("Error log");
        logger.warn("Log de warning");
        logger.info("Log de info");
        logger.debug("Log de debug");
        logger.trace("Log de trace");
    }

    public static void main(String[] args) {
        new LoggerDemo().logs();
    }
}

