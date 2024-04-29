package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productMenu;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    public WebElement viewProduct;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement addToCart;

    @FindBy(xpath = "//button[@data-dismiss='modal']")
    public WebElement confirmButton;

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void click_product_menu() throws InterruptedException{
        productMenu.click();
    }

    public void click_view_product() throws InterruptedException{
        viewProduct.click();
    }

    public void click_add_to_cart() throws InterruptedException{
        addToCart.click();
    }

    public void click_confirm_button() throws InterruptedException{
        confirmButton.click();
    }

}
