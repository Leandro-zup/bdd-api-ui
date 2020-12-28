package webSite.pageObjects.checkouts;

import org.openqa.selenium.By;
import webSite.base.hooks;

public class checkoutsMap extends hooks {

    public static final By TEXT_NOME = By.id("first-name");

    public static final By TEXT_ULTIMO_NOME = By.id("last-name");

    public static final By TEXT_CEP = By.id("postal-code");

    public static final By BUTTON_CONTINUAR = By.cssSelector("[value=\"CONTINUE\"]");

    public static final By BUTTON_FINALIZAR = By.cssSelector("[class=\"btn_action cart_button\"]");

    public static final By NOME_PRODUTO = By.cssSelector("[class=\"inventory_item_name\"]");

    public static final By PRECO_PRODUTO = By.cssSelector("[class='inventory_item_price']");

    public static final By MESSAGE_PARABENS = By.cssSelector("[class=\"complete-header\"]");
}