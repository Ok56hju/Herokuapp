package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JSAlertsPage;
import org.testng.annotations.Test;

public class JSAlertsTests extends TestBase{


    @Test
    public void windowJSAlertTest(){
        new JSAlertsPage(driver).switchToNextWindow(0).verifyNewPageMessage("JavaScript Alerts");
    }
}
