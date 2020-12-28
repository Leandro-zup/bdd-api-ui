package webSite.pageObjects.checkouts;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import webSite.base.util;

public class checkoutsPage extends checkoutsMap {

    util _util = new util();

    public void preencherInformacoes(String nome,String ultimoNome ,String cep ) {
        driver.findElement(TEXT_NOME).sendKeys(nome);
        driver.findElement(TEXT_ULTIMO_NOME).sendKeys(ultimoNome);
        driver.findElement(TEXT_CEP).sendKeys(cep);
        clicarCadastrar();
    }

    public void clicarCadastrar() {
        driver.findElement(BUTTON_CONTINUAR).click();
    }

    public void validarOverviewCompra(String nome, String preco){
        _util.waitElement(NOME_PRODUTO);

        String textoElement1 = driver.findElement(NOME_PRODUTO).getText();
        Assert.assertThat(textoElement1, CoreMatchers.containsString(nome));

        String textoElement2 = driver.findElement(PRECO_PRODUTO).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString(preco));

        driver.findElement(BUTTON_FINALIZAR).click();
    }

    public void validarParabens(){
        String textoElement1 = driver.findElement(MESSAGE_PARABENS).getText();
        Assert.assertThat(textoElement1, CoreMatchers.containsString("THANK YOU FOR YOUR ORDER"));
    }
}
