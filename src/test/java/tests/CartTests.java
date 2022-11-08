package tests;

import data.Credentials;
import data.Product;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import steps.BaseSteps;
import steps.CartSteps;
import steps.LoginSteps;
import steps.ProductSteps;

public class CartTests extends BaseTest {

    @Steps
    BaseSteps baseSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    ProductSteps productSteps;
    @Steps
    CartSteps cartSteps;

    @Test
    public void testProductAddedIntoTheBasket() {
        baseSteps.openDemoPage();
        loginSteps.loginWith(Credentials.CORRECT_CREDENTIALS);
        productSteps.addProductIntoTheCart(Product.SAUCE_LABS_BACKPACK);
        productSteps.goToCart();
        cartSteps.verifyNumberOfItemsInCart(1);
        cartSteps.verifyProductsInCart(Product.SAUCE_LABS_BACKPACK);
    }
}
