package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceService extends ActionManager {

    public static void clickButtonWorkspace() {
        waitClickable(BUTTON_WORKSPACE).click();
    }

    public static void clickButtonManage() {
        waitClickable(TEXT_MANAGE).click();
    }

    public static void buttonCreateNewWorkspace() {
        waitClickable(TEXT_BUTTON_CREATE_WORKSPACE).click();
    }

    public static String generateRandomName() {
        int length = new Random().nextInt(10) + 4;
        return new Random().ints(length, 'a', 'z' + 4)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void sendNameWorkspaceRandom() {
        String randomName = "New Workspace: " + generateRandomName();
        waitClickable(INPUT_NAME_WORKSPACE).click();
        setInput(INPUT_NAME_WORKSPACE, randomName, true, true);

    }

    public static void clickButtonCreate() {
        waitClickable(BUTTON_CREATE).click();
    }

    public static void selectWorkspace() {
        List<WebElement> workspaceElements = getElements(LIST_WORKSPACE);

        WebElement elementToClick = null;
        for (WebElement element : workspaceElements) {
            if (!element.getText().contains("Active")) {
                elementToClick = element;
                break;
            }
        }
    }

    public static void clickIconx() {
        waitClickable(ICON_DELETE_WORKSPACE).click();
    }

    public static void deleteWorkspace() {
        selectWorkspace();
        clickIconx();
        waitClickable(INPUT_DELETE_WORKSPACE).click();
        setInput(INPUT_DELETE_WORKSPACE, "DELETE");
        waitClickable(BUTTON_DELETE_WORKSPACE).click();

    }
}

