package webSite.pageObjects.login;

import webSite.base.hooks;
import org.openqa.selenium.By;

public class loginMap extends hooks {

    public static final By TEXT_USERNAME = By.id("user-name");

    public static final By TEXT_PASSWORD = By.id("password");

    public static final By BUTTON_ENTRAR = By.id("login-button");

    public static final By MESSAGE_FAIL_LOGIN = By.cssSelector("[data-test=error]");

    public static final By MESSAGE_LOGIN = By.cssSelector("[class=login_password]");
}
