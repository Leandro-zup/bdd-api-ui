package webSite.pageObjects.login;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class loginPage extends loginMap {

    public void preencherCredenciais(String usuario, String senha) {
        driver.findElement(TEXT_USERNAME).sendKeys(usuario);
        driver.findElement(TEXT_PASSWORD).sendKeys(senha);
    }
    public void clicarEntrar() {
        driver.findElement(BUTTON_ENTRAR).click();
    }

    public void validarLoginFail() throws InterruptedException {
        Thread.sleep(1000);
        String textoElement = driver.findElement(MESSAGE_FAIL_LOGIN).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Sorry, this user has been locked out."));
    }

    public void validarTelaLogin(){
        String textoElement = driver.findElement(MESSAGE_LOGIN).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Password for all users:"));
    }
}
