package steps;

import data.Product;
import net.thucydides.core.annotations.Step;
import pages.ProductsPage;

public class ProductSteps {

    ProductsPage productsPage;

    @Step("User adds product {0} into the cart")
    public void addProductIntoTheCart(Product product) {
        productsPage.addProductIntoTheBasket(product.toString());
    }

    @Step("User goes to the cart")
    public void goToCart() {
        productsPage.goToCart();
    }
}
