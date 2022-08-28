import org.openqa.selenium.By;

public class Locators {

    //Registration locators

    public static final By MAIN_PAGE_REGISTRATION_BUTTON = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    public static final By TEXT_FIELD_FIRST_NAME = By.cssSelector("input[name='first-name']");
    public static final By TEXT_FIELD_LAST_NAME = By.cssSelector("input[name='last-name']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[name='email']");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='phone']");
    public static final By TEXT_FIELD_JOB_TITLE = By.xpath("//input[@name='your-job title ']");
    public static final By TEXT_FIELD_ENG_LEVEL = By.xpath("//input[@name='english-level']");
    public static final By TEXT_FIELD_WHY_QA = By.xpath("//input[@name='why-do you want to learn automation?']");

    //Mainpage iframe locators

    public static final By CHAT_IFRAME_LOCATOR = By.xpath("//iframe[@title='Wix Chat']");
    public static final By CHAT_IFRAME_BUTTON = By.xpath("//button[@id='minimized-chat']");
}
