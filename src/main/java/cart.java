import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {
    @Given("I have products in the cart")
    public void iHaveProductsInTheCart() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/cart");
    }

    @When("I remove a product from the cart")
    public void iRemoveAProductFromTheCart() {
        WebElement driver;
        WebElement removeButton = driver.findElement(By.id("remove-button"));
        removeButton.click();
    }

    @Then("The product should be removed from the cart")
    public void theProductShouldBeRemovedFromTheCart() {
        WebDriver driver;
        WebElement cartItem = driver.findElement(By.id("cart-item"));
        Object Assert;
        Assert.assertFalse(cartItem.isDisplayed());
        driver.quit();
    }
}
