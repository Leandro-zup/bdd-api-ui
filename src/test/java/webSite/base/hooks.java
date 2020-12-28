package webSite.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class hooks {

    public static WebDriver driver;
    protected WebDriverWait wait;
    public static WebDriver getDriver() {
        return driver;
    }

    public void acessarURLChrome() {

        String urlSite =
                System.getProperty("urlSite") != null
                        ? System.getProperty("urlSite")
                        : handleProperties.getValue("url_site");

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.managed_default_content_settings.geolocation", 2);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("disable-infobars");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1400,1000");
        //options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(urlSite);
    }

    public static void fecharNavegador() {
        driver.close();
    }
}
