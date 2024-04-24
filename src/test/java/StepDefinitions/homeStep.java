package StepDefinitions;

import Pages.homePage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import io.cucumber.java.pl.I;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homeStep {
    public WebDriver driver;

    homePage home_page;

    public homeStep(){
        this.driver = this.getDriver();
        home_page = new homePage(driver);
    }

    public WebDriver getDriver(){
        System.setProperty("webdriver.chorme.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    @Given("user open website")
    public void open_website() throws InterruptedException{
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);
    }

    @When("user click login menu")
    public void click_login_menu() throws InterruptedException{
        home_page.click_login_menu();
    }

    @And("user given username and email")
    public void user_name_and_email() throws InterruptedException{
        home_page.set_username();
        home_page.set_email();
    }

    @And("user click login button")
    public void click_login_button() throws InterruptedException{
        home_page.click_login_button();

    }

    @And("user select gender")
    public void user_select_gender()throws InterruptedException {
        home_page.select_gender();
    }

    @And("user set password")
    public void user_set_password() throws InterruptedException{
        home_page.set_password();
    }

    @And("user set birth info")
    public void user_set_birth_info() throws InterruptedException{
        home_page.set_birth_info();
    }

    @And("user set an option")
    public void user_set_an_option() throws InterruptedException{
        home_page.set_an_option();
    }

    @And("user set personal info")
    public void user_set_personal_info() throws InterruptedException{
        home_page.set_personal_info();
    }

    @And("user select country info")
    public void user_select_country_info() throws InterruptedException{
        home_page.set_address_info();
    }

    @And("user set mobile number")
    public void user_set_mobile_number() throws InterruptedException{
        home_page.set_mobile_number();
    }

    @And("user click create ac button")
    public void user_click_create_ac_button() throws InterruptedException{
        home_page.click_create_ac_button();
    }

    @And("user click continue button")
    public void user_click_continue_button() {
        home_page.click_continue_button();
    }

    @Then("user get assertion")
    public void user_get_assertion(){
        Assert.assertTrue("Logged in as Shakil", home_page.assertion_message());
        driver.quit();
    }
}
