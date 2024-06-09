package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;
import static lippia.web.constants.ClockifyConstants.*;

public class ProjectResultService {

    public static void validateProjectCreated(){
        waitVisibility(ALERT_CONFIRM_CREATE_PROJECT);
        String popUp = WebActionManager.getAttribute(ALERT_CONFIRM_CREATE_PROJECT, "textContent");
        Assert.assertTrue(popUp != null && popUp.endsWith("created"));
    }
}
