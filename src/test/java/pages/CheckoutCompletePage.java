package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutCompletePage extends BasePage {

    @FindBy(id = "checkout_complete_container")
    WebElementFacade checkoutComplete;

    @FindBy(id = "back-to-products")
    WebElementFacade backToShopButton;

    @Override
    public void openPage() {
        openUrl("https://www.saucedemo.com/checkout-complete.html");
    }

    @Override
    public boolean isDisplayed() {
        return checkoutComplete.isDisplayed();
    }

    public void goBackToProducts() {
        backToShopButton.click();
    }
}
