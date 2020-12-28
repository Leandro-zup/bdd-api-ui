package webSite.pageObjects.carrinho;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import webSite.base.util;

public class carrinhoPage extends carrinhoMap {

    util _util = new util();

    public void clicarCarrinho(){
        driver.findElement(BUTTON_CARRINHO).click();
    }

    public void validarProdutoCarrinho(String nome, String preco){
        _util.waitElement(NOME_PRODUTO_1);

        String textoElement1 = driver.findElement(NOME_PRODUTO_1).getText();
        Assert.assertThat(textoElement1, CoreMatchers.containsString(nome));

        String textoElement2 = driver.findElement(PRECO_PRODUTO_1).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString(preco));
    }

    public void clicarCheckout(){
        driver.findElement(BUTTON_CHECKOUT).click();
    }
}
