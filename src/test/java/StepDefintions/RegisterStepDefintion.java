package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefintion {
    WebDriver driver = null;
    @When("user enter click on register")
    public void clickonregister() throws InterruptedException {
        driver = new ChromeDriver();
        driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]")).click();
        Thread.sleep(5000);

    }
    @And("enters valid data")
    public void enteringvaliddataforregis() throws InterruptedException {
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Menna");
        driver.findElement(By.id("LastName")).sendKeys("Mahmoud");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("20");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1992");
        driver.findElement(By.id("Email")).sendKeys("mennawahby92@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("BM");
        driver.findElement(By.id("Password")).sendKeys("MennaMenna");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("MennaMenna");
        driver.findElement(By.id("register-button")).click();


    }
    @Then("user register successfully")
    public void Registersuccefully() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.cssSelector("a[href=\"/\"]")).isDisplayed());


        Thread.sleep(7000);


    }
}
