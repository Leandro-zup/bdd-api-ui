package webSite.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import webSite.base.hooks;
import webSite.pageObjects.inventario.inventarioPage;
import webSite.pageObjects.login.loginPage;
import webSite.pageObjects.menu.menuPage;

public class loginStep extends hooks {

    loginPage _login = new loginPage();
    inventarioPage _invent = new inventarioPage();
    menuPage _menu = new menuPage();

    @Before
    public void setUp(Scenario scenario) throws Exception {
        acessarURLChrome();
    }

    @After
    public void tearDown(Scenario scenario) {
        fecharNavegador();
    }

    @Dado("^o usuário não autenticado acessa a tela de Login$")
    public void oUsuárioNãoAutenticadoAcessaATelaDeLogin() {
        _login.validarTelaLogin();
    }

    @Quando("^preenche \"([^\"]*)\" e \"([^\"]*)\" e clica em Login$")
    public void preencheEEClicaEmLogin(String arg0, String arg1) throws Throwable {
        _login.preencherCredenciais(arg0,arg1);
        _login.clicarEntrar();
    }

    @Então("^o usuário é autenticado no sistema com sucesso$")
    public void oUsuárioÉAutenticadoNoSistemaComSucesso() {
        _invent.validarTelaInventario();
    }

    @Então("^o usuário não é autenticado no sistema$")
    public void oUsuárioNãoÉAutenticadoNoSistema() throws InterruptedException {
        _login.validarLoginFail();
    }

    @Dado("^o usuário autenticado no sistema$")
    public void oUsuárioAutenticadoNoSistema() {
        _login.preencherCredenciais("standard_user","secret_sauce");
        _login.clicarEntrar();
    }

    @E("^clica em Menu >> Logout$")
    public void clicaEmMenuLogout() {
        _menu.deslogar();
    }

    @Então("^o usuário é deslogado do sistema$")
    public void oUsuárioÉDeslogadoDoSistema() {
        _login.validarTelaLogin();
    }
}
