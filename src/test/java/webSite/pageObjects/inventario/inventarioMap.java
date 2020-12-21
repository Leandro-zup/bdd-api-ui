package webSite.pageObjects.inventario;

import org.openqa.selenium.By;
import webSite.base.hooks;

public class inventarioMap extends hooks {

    public static By NOME_PRODUTOS(String data) {
        return By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[" +data+ "]/div[2]/a/div");
    }

    public static By PRECO_PRODUTOS(String data) {
        return By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[" +data+ "]/div[3]/div");
    }

    public static final By MESSSAGE_PRODUTOS = By.cssSelector("[class=product_label]");

}
