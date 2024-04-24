package Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginMenu;

    @FindBy(name = "name")
    public WebElement userName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailAddress;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement loginButton;

    public homePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void click_login_menu() throws InterruptedException{
        loginMenu.click();
        Thread.sleep(2000);
    }

    public void set_username() throws InterruptedException{
        userName.sendKeys("Shakil");
        Thread.sleep(2000);
    }

    public void set_email() throws InterruptedException{
        emailAddress.sendKeys("shakil@mail.com");
        Thread.sleep(2000);
    }

    public void click_login_button() throws InterruptedException{
        loginButton.click();
        Thread.sleep(2000);
    }
}
