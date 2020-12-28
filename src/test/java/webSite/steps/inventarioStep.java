package webSite.steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import webSite.pageObjects.carrinho.carrinhoPage;
import webSite.pageObjects.inventario.inventarioPage;
import webSite.pageObjects.menu.menuPage;

public class inventarioStep {

    inventarioPage _invent = new inventarioPage();
    menuPage _menu = new menuPage();
    carrinhoPage _carrinho = new carrinhoPage();

    @E("^clica em Menu Inventário$")
    public void clicaEmMenuInventário() {
        _menu.todosItens();
    }

    @Então("^verifica o \"([^\"]*)\" , \"([^\"]*)\" e \"([^\"]*)\" dos produtos$")
    public void verificaOEDosProdutos(String arg0, String arg1, String arg2) throws Throwable {
        _invent.validarProdutosInventario(arg0,arg1,arg2);
    }

    @Quando("^adiciona o produto da posicao \"([^\"]*)\" ao carrinho$")
    public void adicionaOProdutoDaPosicaoAoCarrinho(String arg0) throws Throwable {
        _invent.clicarProdutoCarrinho(arg0);
        _carrinho.clicarCarrinho();
    }
}
