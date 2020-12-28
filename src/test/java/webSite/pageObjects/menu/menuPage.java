package webSite.pageObjects.menu;

import webSite.base.basePage;

public class menuPage extends menuMap {

    basePage _base = new basePage();

    public void deslogar() {
        _base.clicarBotao(BUTTON_MENU);
        _base.clicarBotao(BUTTON_LOGOUT);
        //driver.findElement(BUTTON_MENU).click();
        //driver.findElement(BUTTON_LOGOUT).click();
    }

    public void todosItens() {
        _base.clicarBotao(BUTTON_MENU);
        _base.clicarBotao(BUTTON_ALL_ITENS);
        //driver.findElement(BUTTON_MENU).click();
        //driver.findElement(BUTTON_ALL_ITENS).click();
    }
}
