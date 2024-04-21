package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JSAlertsPage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSAlertsTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        //захдим на дом стр u загрузка стр
        new HomePage(driver).selectJSAlert();

    }
    @Test
    public void isAlertPresentTest(){
        new JSAlertsPage(driver).clickForJSAlert();
        new JSAlertsPage(driver).isAlertPresent();

    }

    @Test
    public void alertWithSelectTest(){
        new JSAlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");

    }

    @Test
    public void sendMessageToAlertTest(){
        new JSAlertsPage(driver).sendMessageToAlert("Hallo").verifyMassage("Hallo");
    }

}
