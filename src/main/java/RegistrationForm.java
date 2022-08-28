import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {

    public RegistrationForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void completeRegistration() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.TEXT_FIELD_FIRST_NAME));
        driver.findElement(Locators.TEXT_FIELD_FIRST_NAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_FIELD_LAST_NAME).sendKeys(Data.lastName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElements(Locators.TEXT_FIELD_EMAIL).get(0).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(Locators.TEXT_FIELD_JOB_TITLE).sendKeys(Data.jobTitle);
        driver.findElement(Locators.TEXT_FIELD_ENG_LEVEL).sendKeys(Data.engLevel);
        driver.findElement(Locators.TEXT_FIELD_WHY_QA).sendKeys(Data.whyQA);
    }
}
