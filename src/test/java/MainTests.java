import org.testng.annotations.Test;


public class MainTests extends BaseUI {


    @Test
    public void completeRegistration() {
        mainPage.clickRegistrationButton();
        registrationForm.completeRegistration();
    }

    @Test
    public void testIframeChat() {
        mainPage.switchToChatFrame();
        mainPage.clickChatButton();
    }
}
