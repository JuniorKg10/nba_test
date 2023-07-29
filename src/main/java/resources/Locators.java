package resources;

import org.openqa.selenium.By;

public class Locators {
    static private By setLocator(String s) {
        return By.xpath(s);

    }
    private String TAG_A_TEXT(String text){
        return "//a[text()=' "+text+" ']";
    }
    public static final By TITLE = setLocator("//h3");
    //RegistrationPage
    public static final By INPUT = setLocator("");
    public static final By REGISTRUJ_SE = setLocator("//a[text()=' Registruj se ']");
    public static final By EMAIL = setLocator("//input[@id='email']");
    public static final By PASS_FIRST = setLocator("//input[@id='password_first']");
    public static final By PASS_SECOND = setLocator("//input[@id='password_second']");
    public static final By CHECKBOX_1 = setLocator("//input[@id='tos']");
    public static final By CHECKBOX_2 = setLocator("//input[@id='easySaleConsent']");
    public static final By CHECKBOX_3 = setLocator("//input[@id='easyBuyConsent']");
    public static final By REGISTRACIJA_NA_MAIL = setLocator("//button[@name='login']");
    public static final By REGISTRATION_SUCCESSFUL = setLocator("//p[contains(text(),'Hvala na registraciji!')]");
    //Proton Mail
    public static final By SIGN_IN = setLocator("//a[@href='https://account.proton.me/login?product=generic&language=en']");
    public static final By JS_ALERTS = setLocator("//button[text()='Click for JS Alert']");
    public static final By JS_CONFRIM = setLocator("//button[text()='Click for JS Confirm']");
    public static final By JS_PROMT = setLocator("//button[text()='Click for JS Prompt']");
    public static final By RESULT = setLocator("//p[@id='result']");

    //context menu

    public static final By CONTEXT_MENU_BOX = setLocator("//div[@id='hot-spot']");

    //add remove elements
    public static final By ADD_REMOVE_ELEMENTS = setLocator("//button[text()='Add Element']");
    public static final By DELETE_ELEMENT = setLocator("//button[text()='Delete']");
    // multiple windows
    public static final By CLICK_HERE = setLocator("//a[text()='Click Here']");
    // JQuery UI
    public static final By ENABLE_ITEM = setLocator("//a[text()='Enabled']");
    public static final By DOWNLOADS_ITEM = setLocator("//a[text()='Downloads']");
    public static final By EXCEL_ITEM = setLocator("//a[text()='Excel']");
    // upload file
    public static final By CHOOSE_FILE = setLocator("//input[@id='file-upload']");
    public static final By UPLOAD_BUTTON = setLocator("//input[@id='file-submit']");
    public static final By UPLOADED_FILES = setLocator("//div[@id='uploaded-files']");
    // download file
    public static final By TEST_FILE = setLocator("//a[text()='Test.txt']");
    // drag and drop
    public static final By BOX_A = setLocator("//div[@id='column-a']//header");
    public static final By BOX_B = setLocator("//div[@id='column-b']//header");
    //browser windows
    public static final By NEW_WINDOW = setLocator("//button[@id='windowButton']");
    public static final By NEW_WINDOW_TEXT = setLocator("//h1[@id='sampleHeading']");
    public static final By NEW_WINDOW_MESSAGE = setLocator("//button[@id='messageWindowButton']");
    //dynamic properties
    public static final By COLOR_CHANGE_BUTTON = setLocator("//button[@id='colorChange']");
    public static final By BACKGROUND_COLOR_BUTTON = setLocator("//button[@id='colorChange']");
    //interactions
    public static final By DRAG_ME = setLocator("//div[@id='draggable']");
    public static final By DROPPED_ME = setLocator("//div[@id='droppable']");
    //frames
    public static final By IFRAME_1 = setLocator("//iframe[@id='frame1']");
    public static final By IFRAME_1_TEXT = setLocator("//h1[@id='sampleHeading']");
    //nested frames
    public static final By PARENT_FRAME = setLocator("//iframe[@id='frame1']");
    public static final By CHILD_IFRAME = setLocator("//iframe");
    public static final By CHILD_IFRAME_TEXT = setLocator("//p[contains(text(),'Child Iframe')]");
    //alerts windows and browser window
    public static final By ALERTS_WINDOWS = setLocator("//div[@class='main-header']");

    public static final By BROWSER_WINDOW = setLocator("//span[contains(text(),'Browser Windows')]");
    public static final By BROWSER_WINDOW_TEXT = setLocator("//div[@class='main-header']");
    public static final By NEW_TAB_BUTTON = setLocator("//button[@id='tabButton']");
    public static final By  SAMPLE_HEADING = setLocator("//h1[@id='sampleHeading']");
    public static final By NEW_WINDOW_BUTTON = setLocator("//button[@id='windowButton']");
    public static final By NEW_WINDOW_TITLE = setLocator("//h1[@id='sampleHeading']");
    public static final By ALERTS_BUTTON = setLocator("//span[contains(text(),'Alerts')]");
    public static final By TO_SEE_ALERT_BUTTON = setLocator("//button[@id='alertButton']");
    public static final By TIMER_ALERT_BUTTON = setLocator("//button[@id='timerAlertButton']");
    public static final By CONFIRM_ALERT_BUTTON = setLocator("//button[@id='confirmButton']");
    public static final By LABEL_OK = setLocator("//span[@id='confirmResult']");
    public static final By PROMPT_ALERT_BUTTON = setLocator("//button[@id='promtButton']");
    public static final By LABEL_RESULT = setLocator("//span[@id='promptResult']");
}












