package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginStepDefintion {
WebDriver driver=null;
    @Given("user open browser")
        public void user_open_browser(){
        System.out.println("In first function");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mennatallahw\\IdeaProjects" +
                        "\\MavenSelenium\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();


        }
        @And("navigates to login page")
    public void user_navigates(){  driver.get("https://demo.nopcommerce.com/");

        }
        @When("user enter valid username and password")
    public void enterValiddata() throws InterruptedException {
            driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
            Thread.sleep(7000);
            driver.findElement(By.id("Email")).sendKeys("mennawahby92@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("MennaMenna");

    }


    @And("user click on login button")
    public void clickonlogin() throws InterruptedException {
        driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();
        Thread.sleep(7000);

    }
    @Then("user could login successfully")
    public void loginsuccefully(){
        Assert.assertTrue(driver.findElement(By.cssSelector("a[href=\"/logout\"]")).isDisplayed());

    }

    @When("user click on forgot password")
        public void forgotpassword(){
        driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();


    }
    @And("user enters valid email address")
    public void entersvalidemail() throws InterruptedException {
        driver.findElement(By.id("Email")).sendKeys("mennawahby92@gmail.com");
        driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();
        Thread.sleep(7000);

    }
    @Then("user receives a message to reset password.")
    public void hypermessage(){
        String expectedResult = "Email with instructions has been sent to you";
        String actualResult =  driver.findElement(By.className("content")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));


    }
}
