package steps;

import context.Context;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;


public class GivenSteps {
    WebDriver driver;
    Context context;

    public GivenSteps(Context context) {
        this.context = context;
        driver = context.getWebDriverController().getDriver();
    }

    @Given("I lunch the chrome browser")
    public void i_lunch_the_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I lunch the chrome browser");
//        throw new cucumber.api.PendingException();
    }
}
