package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    @FindBy(className = "inventory_list")
    private WebElementFacade inventoryList;

    @FindBy(className = "title")
    private WebElementFacade title;

    @FindBy(className = "shopping_cart_link")
    private WebElementFacade goToCartLink;

    @Override
    public void openPage() {
        openUrl("https://www.saucedemo.com/inventory.html");
    }

    @Override
    public boolean isDisplayed() {
        return title.getText().equalsIgnoreCase("products");
    }

    public void addProductIntoTheBasket(String productLabel) {
        WebElementFacade addToCartButton = find(By.xpath(String.format("//div[@class='inventory_item_name' and text()='%s']/ancestor::div[@class='inventory_item']//div//button[contains(@id,'add-to-cart')]", productLabel)));
        addToCartButton.click();
    }

    public void goToCart() {
        goToCartLink.click();
    }

}
