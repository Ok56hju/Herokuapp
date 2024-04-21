package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JSAlertsPage extends BasePage{

    public JSAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-child(1) button")
    WebElement buttonJSAlert;
    public JSAlertsPage clickForJSAlert() {
        click(buttonJSAlert);
        return this;
    }

    @FindBy(css = "li:nth-child(2) button")
    WebElement button ;

    public JSAlertsPage selectResult(String confirm) {
        click(button);

        if (confirm !=null && confirm.equals("OK")){
            driver.switchTo().alert().accept();
        }else if (confirm !=null && confirm.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement promptResult;

    public JSAlertsPage verifyMassage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));

        return this;
    }

    @FindBy(css = "li:nth-child(3) button")
    WebElement promButton;
    public JSAlertsPage sendMessageToAlert(String message) {
        click(promButton);
        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }


    @FindBy(id = "result")
    WebElement clickMeResult;
    public JSAlertsPage verifyResult(String text)
    {
        Assert.assertTrue(clickMeResult.getText().contains(text));
        return this;
    }

}
