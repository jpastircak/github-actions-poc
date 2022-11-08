package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutSummaryPage extends BasePage {

    @FindBy(id = "checkout_summary_container")
    private WebElementFacade checkoutSummaryContainer;

    @FindBy(id = "finish")
    private WebElementFacade finishButton;

    @Override
    public void openPage() {
        openUrl("https://www.saucedemo.com/checkout-step-two.html");
    }

    @Override
    public boolean isDisplayed() {
        return checkoutSummaryContainer.isDisplayed();
    }

    public void finishOrder() {
        finishButton.click();
    }
}
