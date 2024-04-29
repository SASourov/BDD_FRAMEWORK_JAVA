package Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.Random;


public class homePage {

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginMenu;

    @FindBy(name = "name")
    public WebElement userName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailAddress;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement loginButton;

    @FindBy(id = "id_gender1")
    public WebElement gender;

    @FindBy(id = "password")
    public WebElement setPassword;

    @FindBy(id = "days")
    public WebElement birthDay;

    @FindBy(id = "months")
    public WebElement birthMonth;

    @FindBy(id = "years")
    public WebElement birthYear;

    @FindBy(id = "newsletter")
    public WebElement setOption;

    @FindBy(id = "first_name")
    public WebElement setFirstName;

    @FindBy(id = "last_name")
    public WebElement setLastName;

    @FindBy(id = "address1")
    public WebElement personalAddress;

    @FindBy(id = "country")
    public WebElement selectCountry;

    @FindBy(id = "state")
    public WebElement setState;

    @FindBy(id = "city")
    public WebElement setCity;

    @FindBy(id = "zipcode")
    public WebElement zipCode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickCreateButton;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButton;

    @FindBy(xpath = "//header[@id='header']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
    public WebElement visibleText;


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
        emailAddress.sendKeys("test@"+ generateRandomNumber() +"mail.com");
        Thread.sleep(2000);
    }

    public void click_login_button() throws InterruptedException{
        loginButton.click();
        Thread.sleep(2000);
    }

    public void select_gender() throws InterruptedException{
        gender.click();
        Thread.sleep(1000);
    }

    public void set_password() throws InterruptedException{
        setPassword.sendKeys("Test@123");
    }

    public void set_birth_info() throws InterruptedException{
        birthDay.click();
        birthDay.sendKeys("15");
        birthDay.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        birthMonth.click();
        birthMonth.sendKeys("June");
        birthMonth.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        birthYear.click();
        birthYear.sendKeys("1999");
        birthYear.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public void set_an_option() throws InterruptedException{
        setOption.click();
    }

    public void set_personal_info() throws InterruptedException{
        setFirstName.sendKeys("Shakil");
        Thread.sleep(1000);

        setLastName.sendKeys("Ahmed");
        Thread.sleep(1000);

        personalAddress.sendKeys("Banani, Dhaka");
        Thread.sleep(1000);

    }

    public void set_address_info() throws InterruptedException{
        selectCountry.click();
        selectCountry.sendKeys("Aus");
        selectCountry.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        setState.sendKeys("Melborn");

        setCity.sendKeys("Melborn");

        zipCode.sendKeys("7512");
    }

    public void set_mobile_number()throws InterruptedException{
        mobileNumber.sendKeys("01723000000");
    }

    public void click_create_ac_button() throws InterruptedException{
        clickCreateButton.click();
    }

    public void click_continue_button(){
        continueButton.click();
    }

    public boolean assertion_message(){
        return visibleText.isDisplayed();
    }
}
