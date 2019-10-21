package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginDefinition {

    @When("I open facebook login page")
    public void i_open_facebook_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I open facebook login page");
    }

    @Then("I Verify that logo present on page")
    public void i_Verify_that_logo_present_on_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I Verify that logo present on page");
    }

    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("close browser");
    }
}
