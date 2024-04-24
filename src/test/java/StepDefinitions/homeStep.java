package StepDefinitions;

import Pages.homePage;
import io.cucumber.java.en.*;
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
        driver.quit();
    }
}
