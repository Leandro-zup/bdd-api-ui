package webSite.pageObjects.inventario;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import webSite.base.basePage;

public class inventarioPage extends inventarioMap {

    basePage _basePage = new basePage();

    public void validarTelaInventario() {
        String textoElement = driver.findElement(MESSSAGE_PRODUTOS).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Products"));
    }

    public void validarProdutosInventario(String nomeProduto, String preco, String posicao) {
        String textoElement1 = driver.findElement(NOME_PRODUTOS(posicao)).getText();
        Assert.assertThat(textoElement1, CoreMatchers.containsString(nomeProduto));

        String textoElement2 = driver.findElement(PRECO_PRODUTOS(posicao)).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString(preco));
    }
}
