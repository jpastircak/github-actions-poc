package steps;

import data.CustomerInformation;
import net.thucydides.core.annotations.Step;
import pages.CheckoutCompletePage;
import pages.CheckoutPage;
import pages.CheckoutSummaryPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutSteps {

    CheckoutCompletePage checkoutCompletePage;
    CheckoutSummaryPage checkoutSummaryPage;
    CheckoutPage checkoutPage;

    @Step("User verifies that checkout is complete")
    public void verifyCheckoutComplete() {
        checkoutCompletePage.isDisplayed();
    }

    @Step("User submits order with customer information: {0}")
    public void submitOrder(CustomerInformation customerInformation) {
        assertThat(checkoutPage.isDisplayed()).isTrue();
        checkoutPage.enterPersonalDetails(customerInformation.getFirstName(), customerInformation.getLastName(), customerInformation.getZip());
        checkoutPage.proceedToCheckout();
        checkoutSummaryPage.finishOrder();
    }
}
