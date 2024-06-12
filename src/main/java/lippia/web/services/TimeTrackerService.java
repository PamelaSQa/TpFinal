package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static lippia.web.constants.ClockifyConstants.*;
import static lippia.web.services.ProjectService.clickOptionDelete;
import static lippia.web.services.ProjectService.scrollToElement;

public class TimeTrackerService extends ActionManager {

    public static void setStarTime(String starTime) {
        waitClickable(ICON_TIME).click();
        if (!isPresent(PRINCIPAL_TIME)) {
            waitClickable(OPTION_MANUAL_TIME).click();
        }
        waitClickable(HOUR_FROM).click();
        setInput(HOUR_FROM, starTime, true, true);
    }

    public static void setEndTime(String endTime) {
        waitClickable(HOUR_TO).click();
        setInput(HOUR_TO, endTime, true, true);
    }

    public static void setDate(String date) {
        click(INPUT_DATE);
        setInput(INPUT_DATE, date);
    }

    public static void clickAddButton() {
        waitClickable(BUTTON_ADD_TIME).click();
    }

    public static void clickIconTime() {
        waitClickable(ICON_TIME).click();
        WebElement iconTime = isPresent(PRINCIPAL_TIME) ? waitPresence(ICON_TIME) : null;
        if (iconTime != null) {
            click(iconTime);
        }
    }

    public static void clickOnStartButton() {
        isPresent(START_BUTTON);
        waitClickable(START_BUTTON).click();
    }

    public static void clickMenuDrawerTime() {
        waitClickable(MENU_DRAWER_TIME).click();
    }

    public static void clickButtonDiscard() {
        waitClickable(OPTION_DISCARD).click();

    }

    public static void clickConfirmDiscard() {
        waitClickable(CONFIRM_OPTION_DISCARD).click();
    }

    public static void validateHoursNotLogged() {
        waitVisibility(TEXT_TIME_CANCELLED);
        Assert.assertTrue(getText(TEXT_TIME_CANCELLED).contains("Timer cancelled"));
    }

    public static void updateExistingTimeEntries(String description, String startTime, String endTime) {
        waitClickable(INPUT_DESCRIPTION).click();
        setInput(INPUT_DESCRIPTION, description, true, true);

        waitClickable(INPUT_FROM_HOUR_EXIST).click();
        setInput(INPUT_FROM_HOUR_EXIST, startTime, true, true);

        waitClickable(INPUT_TO_HOUR_EXIST).click();
        setInput(INPUT_TO_HOUR_EXIST, endTime, true, true);
    }

    public static void modifyProjectSelected() {
        if (!isPresent(ICON_PLUS_PROJECT_EDIT)) {
            waitClickable(SELECT_NAME_PROJECT).click();
            waitClickable(NO_PROJECT_NAME).click();
        }
        waitClickable(ICON_PLUS_PROJECT_EDIT).click();
        waitClickable(NAME_PROJECT).click();
    }

    public static void validateLoggerHasBeenUpdated() {
        waitVisibility(TEXT_PROJECT_HAS_BEEN_UPDATED);
        Assert.assertTrue(getText(TEXT_PROJECT_HAS_BEEN_UPDATED).contains("has been updated"));
    }
}
