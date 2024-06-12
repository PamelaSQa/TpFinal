package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import static lippia.web.constants.ClockifyConstants.*;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navigateWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickTextLogin() {
        waitClickable(TEXT_LOGIN).click();
    }

    public static void sendLoginCredential() {
        setInput(INPUT_EMAIL, "pamela.s.qa@gmail.com");
        setInput(INPUT_PASSWORD, "Pruebas2024");
    }

    public static void clickButtonLogin() {
        waitClickable(BUTTON_LOGIN).click();
    }


    public static void clickButtonLogout() {
        waitClickable(BUTTON_PROFILE).click();
        waitClickable(BUTTON_LOGOUT).click();
    }

}


