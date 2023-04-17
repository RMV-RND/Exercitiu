import java.util.logging.Logger;

import static dateExercitiu.Exercitiu.countNumberOfDigits;

public class Main {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        //for "manual testing"
        logger.info(String.valueOf(countNumberOfDigits(100.0)));
        logger.info(String.valueOf(countNumberOfDigits(-3.142)));
        logger.info(String.valueOf(countNumberOfDigits(9999.9999f)));
        logger.info(String.valueOf(countNumberOfDigits(19)));
        logger.info(String.valueOf(countNumberOfDigits(1234567890)));
        logger.info(String.valueOf(countNumberOfDigits(0)));
    }
}
