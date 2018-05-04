import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello World");
        int x =0;
        logger.info("x="+Integer.toString(x));
        logger.warn("dividing by x");
        try {
            x = 5 / x;
        }
        catch (Exception e){
            logger.error("Division by zero!");

        }
        //logger.setLevel(Level.INFO);
        logger.debug("adding 2");
        x=x+2;
    }
}
