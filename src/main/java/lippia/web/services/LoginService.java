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
        click(TEXT_LOGIN);
    }

    public static void sendLoginCredential() {
        setInput(INPUT_EMAIL, "pamela.s.qa@gmail.com");
        setInput(INPUT_PASSWORD,"Practica123*");
    }
    public static void clickButtonLogin() {
        click(BUTTON_LOGIN);
    }
    public static void clickAlert(){
        click(TEXT_ALERT);
    }

    public static void clickButtonLogout(){
        click(BUTTON_PROFILE);
        click(BUTTON_LOGOUT);
    }

}


