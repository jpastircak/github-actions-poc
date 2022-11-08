package steps;

import data.Credentials;
import data.LoginErrorMessage;
import net.thucydides.core.annotations.Step;
import pages.LoginPage;
import pages.ProductsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    LoginPage loginPage;
    ProductsPage productsPage;

    @Step("User logs in with {0}")
    public void loginWith(Credentials credentials) {
        loginPage.enterCredentials(credentials.getUsername(), credentials.getPassword());
        loginPage.submitLogin();
    }

    @Step("User verifies he/she is logged in")
    public void verifyUserLoggedIn() {
        assertThat(productsPage.isDisplayed()).isTrue();
    }

    @Step("User verifies he/she is not logged in with error message: {0}")
    public void verifyUserNotLoggedIn(LoginErrorMessage loginErrorMessage) {
        assertThat(loginPage.isDisplayed());
        assertThat(loginPage.getErrorMessage()).isEqualTo(loginErrorMessage.toString());
    }
}
