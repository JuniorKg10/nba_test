package pages.demoqa;

import common.BaseMethods;
import org.junit.jupiter.api.Assertions;
import resources.Locators;

public class AlertsWindowsPage extends BaseMethods {
    private final String SAMPLE_TEXT = "This is a sample page";
    private final String SAMPLE_ALERT_TEXT = "You clicked a button";
    private final String SAMPLE_TIMER_ALERT_TEXT = "This alert appeared after 5 seconds";

    public AlertsWindowsPage verifyAlertsWindowsPage (){

        Assertions.assertTrue(waitElementToBeVisible(Locators.ALERTS_WINDOWS),"Error! Element is not visible!");
        return this;


    }
    public AlertsWindowsPage clickOnBrowserWindowsButton(){
        clickOnElement(Locators.BROWSER_WINDOW);
        return new AlertsWindowsPage();

    }
    public AlertsWindowsPage verifyBrowserWindowsVisibility() {
        Assertions.assertTrue(waitElementToBeVisible(Locators.BROWSER_WINDOW_TEXT), "Error! Title is not visible!");
        return this;
    }
    public AlertsWindowsPage clickOnNewTabButton() {
        clickOnElement(Locators.NEW_TAB_BUTTON);
        return this;
    }
    public AlertsWindowsPage switchTab(){
        switchToNewTab(1);
        return this;
    }
    public AlertsWindowsPage verifySampleTextVisibility() {
        Assertions.assertTrue(waitElementToBeVisible(Locators.SAMPLE_HEADING), "Error! Title is not visible!");
        return this;
    }
    public AlertsWindowsPage closeTab() {
        switchToNewTab(0);
        return this;
    }
    public BrowserWindowsPage clickOnNewWindowButton() {
        clickOnElement(Locators.NEW_WINDOW_BUTTON);
        return new  BrowserWindowsPage ();
    }
    /* public AlertsWindowsPage switchWindow() {
        changeUrl("https://demoqa.com/sample");
        return this;
    }
    public AlertsWindowsPage verifyTextFromNewWindow(){
        waitElementToBeVisible(Locators.NEW_WINDOW_TITLE);
        Assertions.assertEquals(SAMPLE_TEXT,getText(Locators.NEW_WINDOW_TITLE),"Error! Text is not equal!");
        return this;
    }*/
   /* public AlertsWindowsPage switchToWindow() {
        changeUrl("https://demoqa.com/browser-windows");
        return this;
    }*/
    public AlertsWindowsPage clickOnAlertsButton(){
        clickOnElement(Locators.ALERTS_BUTTON);
        return this;
    }
    public AlertsWindowsPage verifyAlertsVisibility() {
        Assertions.assertTrue(waitElementToBeVisible(Locators.ALERTS_WINDOWS ), "Error! Title is not visible!");
        return this;
    }
    public AlertsWindowsPage clickOnToSeeAlertButton() {
        clickOnElement(Locators.TO_SEE_ALERT_BUTTON);
        return this;
    }
    public AlertsWindowsPage verifyTextFromAlert(){
        Assertions.assertEquals(SAMPLE_ALERT_TEXT,getTextFromAlert(),"Error! Text is not equal!");
        return this;

    }
    public AlertsWindowsPage alertOk() {
        acceptAlert();
        return this;
    }
    public AlertsWindowsPage clickOnTimerAlertButton() {
        clickOnElement(Locators.TIMER_ALERT_BUTTON);
        return this;
    }
    public AlertsWindowsPage verifyTextFromTimerAlert(){
       // waitForAlert();
        Assertions.assertEquals(SAMPLE_TIMER_ALERT_TEXT,getTextFromAlert(),"Error! Text is not equal!");
        return this;

    }

    public AlertsWindowsPage clickOnConfirmAlertButton() {
        clickOnElement(Locators.CONFIRM_ALERT_BUTTON);
        return this;
    }
    public AlertsWindowsPage verifyOkLabelFromAlert() {
        // waitForAlert();
        Assertions.assertTrue(waitElementToBeVisible(Locators.LABEL_OK), "Error! Label Ok is not visible!");
        return this;
    }
    public AlertsWindowsPage clickOnPromptAlertButton() {
        clickOnElement(Locators.PROMPT_ALERT_BUTTON);
        return this;
    }
    public AlertsWindowsPage typeTextInAlert(){
        typeTextInAlert("Milos");
        return this;
    }
    public AlertsWindowsPage verifyResultLabelFromAlert() {
        //waitForAlert();
        Assertions.assertTrue(waitElementToBeVisible(Locators.LABEL_RESULT), "Error! Text in label is not visible!");
        return this;
    }



}
