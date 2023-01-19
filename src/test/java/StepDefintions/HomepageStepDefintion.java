package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

public class HomepageStepDefintion {
    WebDriver driver=null;
    @When("user enters a search item in search tab")
    public void searchformacbook() throws InterruptedException {
        driver.findElement(By.id("small-searchterms")).sendKeys("macbook");
        driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);

    }
@Then("user can find it")
    public void usercanfindit(){
    driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]")).isDisplayed();

}@Then("user change currency")
    public void changeCurrency() throws InterruptedException {
        driver.findElement(By.id("customerCurrency")).sendKeys("Euro");
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);
    }
@And("navigates to shoes display page")
    public void filterwithColor(){
    driver.get("https://demo.nopcommerce.com/shoes");


} @When("user choose a color from filter option")
    public void chooseColor() throws InterruptedException {
        driver.findElement(By.id("attribute-option-15")).click();
        Thread.sleep(7000);
    }
    @Then("user can find the item with the color he chooses")
    public void findItemwithColor(){
        Assert.assertTrue(driver.findElement(By.cssSelector("a[href=\"/adidas-consortium-campus-80s-running-shoes\"]")).isDisplayed());
    }
@When("user can select a top")
    public void selectTop() throws InterruptedException {
    driver.findElement(By.id("small-searchterms")).sendKeys("clothing");
    driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("a[href=\"/nike-tailwind-loose-short-sleeve-running-shirt\"]")).click();
    Thread.sleep(7000);

}
@Then("user can see the selected top displayed")
    public void topDisplayed(){
    Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nike-tailwind-loose-short-sleeve-running-shirt");
}
@When("user can select a product and put it in cart")
    public void SelectproductinCart() throws InterruptedException {
    driver.findElement(By.id("giftcard_43_RecipientName")).sendKeys("Donia");
    driver.findElement(By.id("giftcard_43_RecipientEmail")).sendKeys("donia@gmail.com");
    driver.findElement(By.id("giftcard_43_SenderName")).sendKeys("menna");
    driver.findElement(By.id("giftcard_43_SenderEmail")).sendKeys("Menna@gmail.com");
    driver.findElement(By.id("giftcard_43_Message")).sendKeys("Happy birthday");
    driver.findElement(By.id("add-to-cart-button-43")).click();
    driver.findElement(By.cssSelector("a[href=\"/cart\"]")).click();
    Thread.sleep(3000);
}
@Then("user can see the selected product in the shopping cart")
    public void seeProduct(){
    Assert.assertTrue(driver.findElement(By.id("updatecart")).isDisplayed());
}
@When("user can select a product and put it in Wishlist")
    public void addtoWishlist() throws InterruptedException {
    driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("add-to-wishlist-button-18")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("a[href=\"/wishlist\"]")).click();

}
@Then("user can see the selected product in the Wishlist")
    public void seeWishlist(){
    Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/wishlist");
}
@When("user can select a product and put it in shopping cart")
    public void SelectProduct() throws InterruptedException {
    driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("add-to-cart-button-18")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Shopping cart")).click();
}
@And("proceed in checkout procedures")
    public void Checkout() throws InterruptedException {
    driver.findElement(By.id("termsofservice")).click();
    driver.findElement(By.id("checkout")).click();
    //driver.findElement(By.className("button-1 checkout-as-guest-button")).click();
    // driver.findElement(By.cssSelector("a[href=\"/checkout\"]")).click();
    driver.findElement(By.className("button-1 checkout-as-guest-button")).click();
    // driver.findElement(By.cssSelector("a[href=\"/checkout\"]")).click();
    Thread.sleep(3000);

    driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Donia");
    driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("mohamed");
    driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Donia@gmail.com");
    driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("Egypt");
    driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Cairo");
    driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("18streeet200maadi");
    driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("1001002");
    driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("02229999");
    driver.findElement(By.className("button-1 new-address-next-step-button")).click();
    driver.findElement(By.id("shippingoption_1")).click();
    driver.findElement(By.className("button-1 shipping-method-next-step-button")).click();
    driver.findElement(By.className("button-1 payment-method-next-step-button")).click();
    driver.findElement(By.className("button-1 payment-info-next-step-button")).click();
    driver.findElement(By.className("button-1 confirm-order-next-step-button")).click();
    Thread.sleep(7000);

}@Then("user can make a successful order")
    public void orderCompleted(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/checkout/completed");

    }


}
