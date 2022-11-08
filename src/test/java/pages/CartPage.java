package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElementFacade checkoutButton;

    @FindBy(id = "continue_shopping")
    private WebElementFacade continueShoppingButton;

    @FindBy(className = "title")
    private WebElementFacade title;

    @Override
    public void openPage() {
        openUrl("https://www.saucedemo.com/cart.html");
    }

    @Override
    public boolean isDisplayed() {
        return title.getText().equalsIgnoreCase("Your cart");
    }

    public void continueToCheckout() {
        checkoutButton.click();
    }

    public void backToShopping() {
        continueShoppingButton.click();
    }

    public int getNumberOfCartItems() {
        ListOfWebElementFacades cartItems = findAll(By.className("cart_item"));
        return cartItems.size();
    }

    public List<String> getCartItemsLabels() {
        ListOfWebElementFacades cartItemsLabels = findAll(By.className("inventory_item_name"));
        return cartItemsLabels.texts();
    }
}
