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

    @FindBy(css = "li:nth-child(1)")
    WebElement windowJSAlert;
    public JSAlertsPage clickForJSAlert() {
        click(windowJSAlert);
        return this;
    }


//    @FindBy(css="a[href='/javascript_alerts']")
//    WebElement javascriptAlerts;
//    public JSAlertsPage selectJSAlert () {
//        clickWithJS(javascriptAlerts, 0,600);
//        return new JSAlertsPage(driver);
//    }
//
}
