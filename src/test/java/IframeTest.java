import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class IframeTest extends BaseUI {
    By chatIframeLocator = By.xpath("//iframe[@title='Wix Chat']");
    By chatIframeButton = By.xpath("//button[@id='minimized-chat']");

    @Test
    public void testIframeQATurbo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chatIframeLocator));
        WebElement chatIframe = driver.findElement(chatIframeLocator);
        driver.switchTo().frame(chatIframe);
        driver.findElement(chatIframeButton).click();
    }

}
