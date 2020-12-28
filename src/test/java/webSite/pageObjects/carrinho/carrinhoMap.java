package webSite.pageObjects.carrinho;

import org.openqa.selenium.By;
import webSite.base.hooks;

public class carrinhoMap extends hooks {

    public static final By BUTTON_CARRINHO = By.cssSelector("[data-icon=\"shopping-cart\"]");

    public static final By NOME_PRODUTO_1 = By.cssSelector("[class=\"inventory_item_name\"]");

    public static final By PRECO_PRODUTO_1 = By.cssSelector("[class=inventory_item_price]");

    public static final By BUTTON_CHECKOUT = By.cssSelector("[class=\"btn_action checkout_button\"]");
}
