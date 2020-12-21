package webSite.pageObjects.checkouts;

import org.openqa.selenium.By;
import webSite.base.hooks;

public class checkoutsMap extends hooks {

    public static final By USUARIO = By.name("username");

    public static final By SENHA = By.cssSelector("[name=pass]");

    public static final By CONFIRMA_SENHA = By.cssSelector("[name=confirmpass]");

    public static final By VALIDA = By.cssSelector("[class*='title']");

    public static final By BOTAO_CADASTRAR = By.cssSelector("[class*='txt2']");
}
