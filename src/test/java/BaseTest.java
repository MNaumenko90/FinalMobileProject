import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static config.driver.DriverInit.getDriver;
import static config.driver.DriverInit.quit;

public class BaseTest {

    protected static AppiumDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

    @AfterMethod
    public void close() {
        quit();
    }
}
