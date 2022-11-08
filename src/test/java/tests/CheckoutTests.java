package tests;

import data.Credentials;
import data.CustomerInformation;
import data.Product;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import steps.*;

public class CheckoutTests extends BaseTest {

    @Steps
    BaseSteps baseSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    ProductSteps productSteps;
    @Steps
    CartSteps cartSteps;
    @Steps
    CheckoutSteps checkoutSteps;

    @Test
    public void testCheckoutWithCompleteOrder() {
        baseSteps.openDemoPage();
        loginSteps.loginWith(Credentials.CORRECT_CREDENTIALS);
        productSteps.addProductIntoTheCart(Product.SAUCE_LABS_BACKPACK);
        productSteps.goToCart();
        cartSteps.proceedToCheckout();
        checkoutSteps.submitOrder(CustomerInformation.CUSTOMER_1);
        checkoutSteps.verifyCheckoutComplete();
    }

}
