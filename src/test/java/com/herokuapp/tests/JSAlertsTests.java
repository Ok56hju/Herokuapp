package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JSAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSAlertsTests extends TestBase {
    public void precondition(){
        //захдим на дом стр u загрузка стр
        new HomePage(driver).selectJSAlert();

    }
    @Test
    public void JSAlertTest() {
        new JSAlertsPage(driver).clickForJSAlert();
    }
}
