package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class JSAlertsPage extends BasePage{

    public JSAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "//a[.='JavaScript Alerts']")
    WebElement jsAlert;

    public JSAlertsPage switchToNextWindow(int index) {

        clickWithJS(jsAlert, 0, 600);
        List<String> pages = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(pages.get(index));
        return this;
    }

    @FindBy(css = "h3")
    WebElement h3;
    public JSAlertsPage verifyNewPageMessage(String text) {
        Assert.assertTrue(shouldHaveText(h3,text, 10));
        return this;
    }


}
