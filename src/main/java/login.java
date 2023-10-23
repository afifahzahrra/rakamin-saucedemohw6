import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public ChromeDriver driver;

    @Given("I open the SauceDemo website")
    public void iOpenTheSauceDemoWebsite() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        WebElement loggedInMessage = driver.findElement(By.className("product_label"));
        Object Assert;
        Assert.assertEquals("Products", loggedInMessage.getText());
    }

    @When("I enter valid username")
    public void iEnterValidUsername() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Object Assert;
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.quit();
    }
}
