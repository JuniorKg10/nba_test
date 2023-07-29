package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Properties {

    private static WebDriver driver;
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";

    private static final String CHROME_DRIVER_PATH = System.getProperty("chromeDriver");

    private static final String AD_BLOCKER_PATH = "src\\main\\resources\\AdBlocker.crx";

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Properties.driver = driver;
    }

    public static void quitDriver(){
        getDriver().quit();
        driver = null;
    }

    public static void createDriver(){

        if(getDriver()==null){
            System.setProperty(CHROME_DRIVER,CHROME_DRIVER_PATH);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("start-fullscreen");
            options.addArguments("--disable-notifications");
            options.addExtensions(new File(AD_BLOCKER_PATH));

            driver = new ChromeDriver(options);

            try{
                Thread.sleep(10000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

            driver.close();
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
        }
    }
}
