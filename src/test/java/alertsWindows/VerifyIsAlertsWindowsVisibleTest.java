package alertsWindows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.Properties;
import pages.demoqa.AlertsWindowsPage;


public class VerifyIsAlertsWindowsVisibleTest extends Properties {



    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().get("https://demoqa.com/alertsWindows");
    }

    @Test
    public void alertsWindows_VerifyIsAlertsWindowsVisibleTest(){

        AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
        alertsWindowsPage.verifyAlertsWindowsPage();




    }

    @AfterEach
    public void close(){
        quitDriver();
    }
}
