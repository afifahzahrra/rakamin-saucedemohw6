import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class products {
    @Given("I am logged in")
    public void iAmLoggedIn() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/login");
    }

    @When("I add a product to the cart")
    public void iAddAProductToTheCart() {
        By driver;
        WebElement product = driver.findElement(By.id("product-id"));
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));

        product.click();
        addToCartButton.click();
    }

    @Then("The product should be in the cart")
    public void theProductShouldBeInTheCart() {
        WebDriver driver;
        WebElement cartItem = driver.findElement(By.id("cart-item"));
        Object Assert;
        Assert.assertTrue(cartItem.isDisplayed());
        driver.quit();
    }
}
