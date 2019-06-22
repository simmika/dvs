import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbstractClassBeforeAfter {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.get("http://141.136.44.216:8080/kodas-spring-1.0-SNAPSHOT/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // jei naudosim kitus waitus sita gal reik trint kad nesipjautu

    }

    @AfterClass
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


}

