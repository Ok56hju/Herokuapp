package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="a[href='/javascript_alerts']")
    WebElement elementJSAlert;
    public JSAlertsPage selectJSAlert() {
        click(elementJSAlert);
        return new JSAlertsPage(driver);
    }

    @FindBy(css = "a[href='/windows']")
    WebElement windows;
    public MultipleWindowsPage selectMultipleWindows() {
        click(windows);
        return new MultipleWindowsPage(driver);
    }

    @FindBy(css = "a[href='/broken_images']")
    WebElement broken_images;
    public BrokenImagesPage selectBrokenImages() {
        click(broken_images);
        return new BrokenImagesPage(driver);
    }
}
