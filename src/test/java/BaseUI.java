import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;
    String url = "https://www.qaturbo.com/";
    MainPage mainPage;
    RegistrationForm registrationForm;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        mainPage = new MainPage(driver, wait);
        registrationForm = new RegistrationForm(driver, wait);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
