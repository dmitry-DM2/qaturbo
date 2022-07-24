import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {

    By mainPageAboutButton = By.xpath("//p[text()='About']");
    By mainPageHomeButton = By.xpath("//p[text()='Home']");
    By mainPageRegistrationButton = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    By textFieldFirstName = By.cssSelector("input[name='first-name']");
    By textFieldLastName = By.cssSelector("input[name='last-name']");
    By textFieldEmail = By.cssSelector("input[name='email']");
    By textFieldPhone = By.cssSelector("input[name='phone']");
    By textFieldJobTitle = By.xpath("//input[@name='your-job title ']");
    By textFieldEngLevel = By.xpath("//input[@name='english-level']");
    By textFieldWhyQA = By.xpath("//input[@name='why-do you want to learn automation?']");
    String firstName = "Dmitry";
    String lastName = "Usikov";
    String email = "dmitrydmtest@gmail.com";
    String phone = "+380961111111";
    String jobTitle = "QA student";
    String engLevel = "Novice";
    String whyQA = "cose Alex Lavrenin the best!";

    @Test
    public void mainPageTest1() {
        driver.findElement(mainPageAboutButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPageHomeButton));
        driver.findElement(mainPageHomeButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(mainPageRegistrationButton));
        driver.findElements(mainPageRegistrationButton).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(textFieldFirstName));
        driver.findElement(textFieldFirstName).sendKeys(firstName);
        driver.findElement(textFieldLastName).sendKeys(lastName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElements(textFieldEmail).get(0).sendKeys(email);
        driver.findElement(textFieldPhone).sendKeys(phone);
        driver.findElement(textFieldJobTitle).sendKeys(jobTitle);
        driver.findElement(textFieldEngLevel).sendKeys(engLevel);
        driver.findElement(textFieldWhyQA).sendKeys(whyQA);
    }

}
