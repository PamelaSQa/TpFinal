package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import static lippia.web.constants.ClockifyConstants.*;

import org.testng.Assert;


public class LoginResultsService extends ActionManager {
    public static void validateMainPage() {
        waitVisibility(INPUT_PLACEHOLDER);
        String placeholderText = getAttribute(INPUT_PLACEHOLDER, "placeholder");
        Assert.assertTrue(placeholderText.contains("What are you working on?"));
    }

    public static void validateCloseSession(){
        waitPresence(TEXT_LOGIN);
        Assert.assertTrue(isVisible(TEXT_LOGIN));
    }

}
