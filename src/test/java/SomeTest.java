import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class SomeTest {

    private static final Logger LOGGER = (LogManager.getLogger(SomeTest.class.getName()));

    @Test
    public void TestCase1(){
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        System.out.println("Hello1");
        LOGGER.info("End of test !!!");}

    @Test
    public void TestCase2(){
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        System.out.println("Hello2"); }
}
