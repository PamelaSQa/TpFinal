package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceResultService extends ActionManager {

    public static void validateTextHasBeenCreated() {
        waitPresence(ALERT_TEXT_CONFIRM);
        Assert.assertTrue(getText(ALERT_TEXT_CONFIRM).contains("has been created"));
    }

}
