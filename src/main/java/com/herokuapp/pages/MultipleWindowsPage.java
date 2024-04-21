package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class  MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Click Here')]")
    WebElement elementClickHere;
    public MultipleWindowsPage ElementClickHereIsPresent() {
        Assert.assertTrue(elementClickHere.isDisplayed(), "Click Here");
        return this;
    }
    @FindBy(xpath = "//a[contains(.,'Click Here')]")
    WebElement windowElement;
    public MultipleWindowsPage switchToNextWindow(int index) {
        click(windowElement);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }
    @FindBy(css = "h3")
    WebElement nWindows;
    public MultipleWindowsPage verifyNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(nWindows,text, 10));
        return this;
    }
}
