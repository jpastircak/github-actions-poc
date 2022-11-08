package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainDemoPage {

    @FindBy(id = "user-name")
    private WebElementFacade usernameInput;
    @FindBy(id = "password")
    private WebElementFacade passwordInput;
    @FindBy(id = "login-button")
    private WebElementFacade loginButton;
    @FindBy(xpath="//h3[@data-test='error']")
    private WebElementFacade loginErrorMessage;

    public void enterCredentials(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void submitLogin() {
        loginButton.click();
    }

    public boolean isErrorDisplayd() {
        return loginErrorMessage.isDisplayed();
    }

    public String getErrorMessage() {
        return loginErrorMessage.getText();
    }
}
