package common;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class BaseMethods extends Properties {

    public static String originalWindow;

    public BaseMethods() {
        originalWindow = getDriver().getWindowHandle();
    }

    /**
     * This method clicks on element
     *
     * @param locator
     * - element location
     * @author mcvetanovic
     */

    protected void clickOnElement(By locator){
        getDriver().findElement(locator).click();

    }

    protected void type(By locator, String text){
        getDriver().findElement(locator).sendKeys(text);
    }

    protected String getText(By locator){

        return getDriver().findElement(locator).getText();
    }

    protected boolean waitElementToBeVisible(By locator){

        boolean isVisible = true;
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        } catch (Exception e) {
            isVisible = false;
        }
        return isVisible;
    }

    protected void doubleClickOnElement(By locator){
        WebElement webElement = getDriver().findElement(locator);
        Actions actions = new Actions(getDriver());

        actions.doubleClick(webElement).perform();

    }

    protected void copyShortcut(){
        Actions actions = new Actions(getDriver());

        actions.keyDown(Keys.CONTROL).keyDown("c").keyUp(Keys.CONTROL).keyUp("c").perform();
    }

    protected void scrollToElement(By locator){

        WebElement webElement = getDriver().findElement(locator);

        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();",webElement);
    }

    protected void openNewTab(){

        getDriver().switchTo().newWindow(WindowType.TAB);
    }
    protected void openNewWindow(){

        getDriver().switchTo().newWindow(WindowType.WINDOW);
    }
    protected void close(){

        getDriver().close();
    }
    protected void switchWindowHandle(String window){

        getDriver().switchTo().window(window);

    }
    protected void changeUrl(String url){

        getDriver().navigate().to(url);
    }
    protected  String randomEmail (int length){
        String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuffer randomString = new StringBuffer(length);
        Random random = new Random();

        for(int i=0; i<length; i++){
            int randomIndex = random.nextInt(alphanumericCharacters.length());
            char randomChar = alphanumericCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return "magica995+" + randomString.toString().toLowerCase() + "@protonmail.com";

    }

    protected void acceptAlert(){
        getDriver().switchTo().alert().accept();
    }

    protected void dismissAlert(){
        getDriver().switchTo().alert().dismiss();
    }

    protected String getTextFromAlert(){
       return getDriver().switchTo().alert().getText();
    }

    protected void typeTextInAlert(String text){
        getDriver().switchTo().alert().sendKeys(text);
    }

    protected void rightClick(By locator){
        WebElement webElement = getDriver().findElement(locator);
        Actions actions = new Actions(getDriver());

        actions.contextClick(webElement).perform();
    }

    protected int getElementCount(By locator){

        return getDriver().findElements(locator).size();
    }
    protected void switchToNewTab(int tab){
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(tab));
    }

    protected void mouseHover(By locator){
        WebElement webElement = getDriver().findElement(locator);
        Actions actions = new Actions(getDriver());

        actions.moveToElement(webElement).build().perform();

    }

    protected void fileUpload(By locator, String file){
        getDriver().findElement(locator).sendKeys(file);
    }

    protected boolean isFileDownloaded(String fileName){
        File file = new File("C:\\Users\\Himera\\Pictures");

        File[] files = file.listFiles();

        for(int i = 0; i < files.length; i++){
            if(files[i].getName().equals(fileName)){
                files[i].delete();
                return true;
            }
        }

        return false;
    }

    protected void dragAndDropElement(By locatorA, By locatorB){
        WebElement webElement1 = getDriver().findElement(locatorA);
        WebElement webElement2 = getDriver().findElement(locatorB);
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(webElement1).moveToElement(webElement2).release(webElement1).build().perform();

    }

    protected void newWindowElement (By locator ){


    }
    protected String getElementColor(By locator){
        return getDriver().findElement(locator).getCssValue("color");
    }
    protected void pause(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected String getBackgroundElementColor(By locator) {
        return getDriver().findElement(locator).getCssValue("background-color");
    }

    protected void switchToIFrame(By locator){
        WebElement webElement1 = getDriver().findElement(locator);
        getDriver().switchTo().frame(webElement1);
    }
    protected void switchBackFromIFrame(){
        getDriver().switchTo().defaultContent();
    }

    protected void switchToParentFrame(By locator){
        WebElement webElement1 = getDriver().findElement(locator);
        getDriver().switchTo().frame(webElement1);
    }
    protected void switchToChildIFrame(){
        getDriver().switchTo().defaultContent();
    }

    protected void selectBrowserWindow(By locator){

    }


}
