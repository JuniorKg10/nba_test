package browserWindows;

import common.Properties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.demoqa.AlertsWindowsPage;


public class VerifyIsBrowserWindowsTextTest extends Properties {



    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().get("https://demoqa.com/alertsWindows");
    }

    @Test
    public void browserWindows_VerifyIsBrowserWindowsTextTest(){

        AlertsWindowsPage alertsWindows = new AlertsWindowsPage();
        alertsWindows.verifyAlertsWindowsPage().clickOnBrowserWindowsButton().verifyBrowserWindowsVisibility().clickOnNewTabButton().switchTab().verifySampleTextVisibility().closeTab().clickOnNewWindowButton().switchWindow().verifyTextFromNewWindow();
//clickOnAlertsButton().verifyAlertsVisibility().clickOnToSeeAlertButton().verifyTextFromAlert().alertOk().clickOnTimerAlertButton().verifyTextFromTimerAlert().alertOk().clickOnConfirmAlertButton().alertOk().verifyOkLabelFromAlert().clickOnPromptAlertButton().typeTextInAlert().alertOk().verifyResultLabelFromAlert();
    }






    @AfterEach
    public void close(){
        quitDriver();
    }
}
