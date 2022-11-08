package steps;

import net.thucydides.core.annotations.Step;
import pages.MainDemoPage;

public class BaseSteps {

    MainDemoPage mainPage;

    @Step("User opens demo page")
    public void openDemoPage() {
        mainPage.openPage();
        mainPage.verifyPageOpen();
    }
}
