package com.herokuapp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    WebDriver driver;

    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        js = (JavascriptExecutor) driver;
    }

    public void click(WebElement element){
        element.click();
    }

    public void type(WebElement element, String text){
        if (text != null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }
    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.alertIsPresent());
        if (alert == null){
            return false;
        }else {
            driver.switchTo().alert();
            alert.accept();
            return true;
        }

    }
    public boolean isElementPresent(By locator ){
        return driver.findElements(locator).size()>0;
    }



}
