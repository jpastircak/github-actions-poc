package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage {

    @FindBy(className = "checkout_info")
    private WebElementFacade checkoutInfoContainer;

    @FindBy(id = "first-name")
    private WebElementFacade firstNameInput;

    @FindBy(id = "last-name")
    private WebElementFacade lastNameInput;

    @FindBy(id = "postal-code")
    private WebElementFacade postalCodeInput;

    @FindBy(id = "continue")
    private WebElementFacade continueButton;

    @Override
    public void openPage() {
        openUrl("https://www.saucedemo.com/checkout-step-one.html");
    }

    @Override
    public boolean isDisplayed() {
        return checkoutInfoContainer.isDisplayed();
    }

    public void enterPersonalDetails(String firstName, String lastName, String zip) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(zip);
    }

    public void proceedToCheckout() {
        continueButton.click();
    }
}
