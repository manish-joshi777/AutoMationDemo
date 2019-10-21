package steps;

import context.Context;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {
    Context context;
    WebDriver driver;

    public Hooks(Context context) {
        this.context = context;
    }

    @Before("login")
    public void beforeScenario() {
        System.out.println("I lunch the chrome browser");
        driver = context.getWebDriverController().getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void afterScenario() {
        context.getWebDriverController().closeDriver();
    }
}
