package tests;

import data.Credentials;
import data.LoginErrorMessage;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import steps.BaseSteps;
import steps.LoginSteps;

public class LoginTests extends BaseTest {

    @Steps
    BaseSteps baseSteps;
    @Steps
    LoginSteps loginSteps;

    @Test
    public void testLoginPositive() {
        baseSteps.openDemoPage();
        loginSteps.loginWith(Credentials.CORRECT_CREDENTIALS);
        loginSteps.verifyUserLoggedIn();
    }

    @Test
    public void testLoginNegative() {
        baseSteps.openDemoPage();
        loginSteps.loginWith(Credentials.INCORRECT_CREDENTIALS);
        loginSteps.verifyUserNotLoggedIn(LoginErrorMessage.INCORRECT_CREDENTIALS);
    }
}
