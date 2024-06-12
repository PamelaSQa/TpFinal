package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static lippia.web.constants.ClockifyConstants.*;
import static lippia.web.services.WorkspaceService.generateRandomName;

public class ProjectService extends ActionManager {


    protected static String nameProject = "";

    public static void clickOnTheIconPlus() {
        click(ICON_PLUS);
    }

    public static void clickOptionCreateNewProject() {
        click(TEXT_CREATE_NEW_PROJECT);
    }

    public static void enteredNameProject() {
        String randomName = "New Project: " + generateRandomName();
        nameProject = randomName;
        waitClickable(INPUT_NAME_NEW_PROJECT);
        setInput(INPUT_NAME_NEW_PROJECT, randomName);
    }

    public static void clickiconProject() {
        click(ICON_SECTION_PROJECT);
    }

    public static void closeAlert() {
        getFluentWait();
        waitClickable(CLOSE_POPUP_ALERT).click();
    }

    public static void clickIconMenuDrawer() {
        waitClickable(ICON_MENU_HAMBURGUER).click();
    }

    public static void clickArchiveProject() {
        click(OPTION_ARCHIVE);
        waitVisibility(POP_UP_BUTTON_ARCHIVE);
        click(POP_UP_BUTTON_ARCHIVE);
        closeAlert();
    }

    public static void scrollToElement(WebElement element) {
        WebDriver driver = DriverManager.getDriverInstance();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOptionDelete() {
        waitPresence(OPTION_DELETE);

        WebElement element = getElement(OPTION_DELETE);
        scrollToElement(element);
        waitClickable(OPTION_DELETE).click();

        waitClickable(CONFIRM_BUTTON_DELETE).click();

    }

    public static void deleteProject() {
        clickiconProject();
        clickIconMenuDrawer();
        clickArchiveProject();
        clickIconMenuDrawer();
        clickOptionDelete();
    }
}
