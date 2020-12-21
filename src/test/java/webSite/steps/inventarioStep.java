package webSite.steps;

import cucumber.api.DataTable;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import webSite.pageObjects.inventario.inventarioPage;
import webSite.pageObjects.login.loginPage;
import webSite.pageObjects.menu.menuPage;

public class inventarioStep {

    loginPage _login = new loginPage();
    inventarioPage _invent = new inventarioPage();
    menuPage _menu = new menuPage();

    @E("^clica em Menu Inventário$")
    public void clicaEmMenuInventário() {
        _menu.todosItens();
    }

    @Então("^verifica o \"([^\"]*)\" , \"([^\"]*)\" e \"([^\"]*)\" dos produtos$")
    public void verificaOEDosProdutos(String arg0, String arg1, String arg2) throws Throwable {
        _invent.validarProdutosInventario(arg0,arg1,arg2);
    }

    @Então("^verifica todos os produtos$")
    public void verificaTodosOsProdutos(DataTable table) {
    }
}
