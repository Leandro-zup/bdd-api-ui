package webSite.base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class util extends hooks {

    private static final long DEFAULT_TIME_WAIT = 20;


    protected WebElement getElement(By locator) {
        return waitElement(locator);
    }

    public void waitVisibility(WebElement element) throws IOException {
        try {
            wait = new WebDriverWait(getDriver(), 20);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            Assert.fail();
        }
    }

    public WebElement waitElement(By locator) {
        return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected List<WebElement> waitElements(By locator) {
        return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected boolean isVisible(By locator) {
        new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.visibilityOf(getElement(locator)));
        return getElement(locator).isDisplayed();
    }

    protected void isNotVisible(By locator) {
        new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.invisibilityOf(getElement(locator)));
    }

    protected boolean isClickable(By locator) {
        new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.elementToBeClickable(getElement(locator)));
        return getElement(locator).isDisplayed() && getElement(locator).isEnabled();
    }

    protected void waitForTextInElement(By locator, String textToBeWait) {
        new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.textToBe(locator, textToBeWait));
    }

    protected void pressTab(By locator) {
        isVisible(locator);
        getElement(locator).sendKeys(Keys.TAB);
    }

    protected void pressEnter(By locator) {
        isVisible(locator);
        getElement(locator).sendKeys(Keys.ENTER);
    }

    public String gerarNome() {
        Random random = new Random();
        String nome= random.toString();
        return nome;
    }

}
