package pages.demoqa;

import common.BaseMethods;
import org.junit.jupiter.api.Assertions;
import resources.Locators;


    public class BrowserWindowsPage extends BaseMethods {
        private final String SAMPLE_TEXT = "This is a sample page";
        public BrowserWindowsPage switchWindow() {
            changeUrl("https://demoqa.com/sample");
            return this;
        }
        public BrowserWindowsPage verifyTextFromNewWindow(){
            waitElementToBeVisible(Locators.NEW_WINDOW_TITLE);
            Assertions.assertEquals(SAMPLE_TEXT,getText(Locators.NEW_WINDOW_TITLE),"Error! Text is not equal!");
            return this;
        }




    }
