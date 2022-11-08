package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.assertj.core.api.Assertions.assertThat;

public class MainDemoPage extends BasePage {

    @FindBy(className = "login_logo")
    private WebElementFacade logo;

    public void openPage() {
        openUrl("https://www.saucedemo.com");
    }

    @Override
    public boolean isDisplayed() {
        return logo.isDisplayed();
    }

    public void verifyPageOpen() {
        assertThat(logo.isDisplayed()).isTrue();
    }

}
