import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkout {
    private WebDriver driver;

    @Given("I am on the cart page")
    public void iAmOnTheCartPage() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/cart");
    }

    @When("I proceed the checkout")
    public void iProceedTheCheckout() {
        WebElement checkoutButton = driver.findElement(By.id("checkout-button"));
        ((org.openqa.selenium.WebElement) checkoutButton).click();
    }

    @Then("I should be on the checkout information page")
    public void iShouldBeOnTheCheckoutInformationPage() {
        String currentUrl = driver.getCurrentUrl();
        Object Assert;
        Assert.assertTrue(currentUrl.contains("checkout-information"));

        driver.quit();
    }
}
