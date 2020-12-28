package webSite.steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import webSite.pageObjects.carrinho.carrinhoPage;
import webSite.pageObjects.checkouts.checkoutsPage;

public class checkoutStep {

    checkoutsPage _checkout = new checkoutsPage();
    carrinhoPage _carrinho = new carrinhoPage();

    @Então("^valida o \"([^\"]*)\" e \"([^\"]*)\"$")
    public void validaOE(String arg0, String arg1) throws Throwable {
        _carrinho.validarProdutoCarrinho(arg0,arg1);
    }

    @E("^clica em Checkout$")
    public void clicaEmCheckout() {
        _carrinho.clicarCheckout();
    }

    @Quando("^preenche \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" da tela de entrega$")
    public void preencheEDaTelaDeEntrega(String arg0, String arg1, String arg2) throws Throwable {
        _checkout.preencherInformacoes(arg0,arg1,arg2);
    }

    @Então("^a compra é efetuada com sucesso$")
    public void aCompraÉEfetuadaComSucesso() {
        _checkout.validarParabens();
    }

    @E("^confirma as informações de \"([^\"]*)\" e \"([^\"]*)\"$")
    public void confirmaAsInformaçõesDeE(String arg0, String arg1) throws Throwable {
        _checkout.validarOverviewCompra(arg0,arg1);
    }
}
