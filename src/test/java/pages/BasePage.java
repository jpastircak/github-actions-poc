package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends PageObject {

    @Managed
    protected WebDriver driver;

    public abstract void openPage();
    public abstract boolean isDisplayed();
}
