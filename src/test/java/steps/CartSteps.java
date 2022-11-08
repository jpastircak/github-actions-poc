package steps;


import data.Product;
import net.thucydides.core.annotations.Step;
import pages.CartPage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps {

    CartPage cartPage;

    @Step("User verifies that number of items in cart is {0}")
    public void verifyNumberOfItemsInCart(int expectedNumberOfItems) {
        assertThat(cartPage.getNumberOfCartItems()).isEqualTo(expectedNumberOfItems);
    }

    @Step("User verifies that cart contains items {0}")
    public void verifyProductsInCart(Product... products) {
        List<String> productNamesList = Arrays.stream(products).map(Product::toString)
                .collect(Collectors.toList());
        List<String> productsInCart = cartPage.getCartItemsLabels();

        assertThat(productsInCart).containsAll(productNamesList);
    }

    @Step("User proceeds to checkout")
    public void proceedToCheckout() {
        cartPage.continueToCheckout();
    }

}
