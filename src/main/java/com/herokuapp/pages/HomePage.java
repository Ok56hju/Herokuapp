package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="a[href='/javascript_alerts']")
    WebElement javascriptAlerts;

    public HomePage selectJSAlert() {
        click(javascriptAlerts);
        return new HomePage(driver);
    }

}
