package StepDefinitions;

import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProductStep {
    public WebDriver driver;

    ProductPage product_page;

    public ProductStep(){
        this.driver = getDriver();
        product_page = new ProductPage(driver);
    }

    public WebDriver getDriver(){
        System.setProperty("webdriver.chorme.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        return driver;
    }

    @Given("user click on product menu")
    public void user_click_on_product_menu() throws InterruptedException{
        driver.get("https://automationexercise.com/");
        product_page.click_product_menu();
        Thread.sleep(2000);
    }

    @When("user click on view product button")
    public void user_click_on_view_product_button() throws InterruptedException{
        product_page.click_view_product();
        Thread.sleep(2000);
    }

    @And("user click on add button")
    public void user_click_on_add_button() throws InterruptedException{
        product_page.click_add_to_cart();
        Thread.sleep(2000);
    }

    @And("user click continue shopping button")
    public void user_click_continue_shopping_button() throws InterruptedException{
        product_page.click_confirm_button();
        Thread.sleep(2000);
        driver.quit();
    }
}
