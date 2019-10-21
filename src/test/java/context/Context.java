package context;

import controller.WebDriverController;

public class Context {
    WebDriverController webDriverController;

    public Context() {
        webDriverController = new WebDriverController();
    }

    public WebDriverController getWebDriverController() {
        return webDriverController;
    }

}
