package webSite.pageObjects.menu;

import org.openqa.selenium.By;
import webSite.base.hooks;

public class menuMap extends hooks {

    public static final By BUTTON_MENU = By.cssSelector("[class=bm-burger-button]");

    public static final By BUTTON_LOGOUT = By.id("logout_sidebar_link");

    public static final By BUTTON_ALL_ITENS = By.id("inventory_sidebar_link");
}
