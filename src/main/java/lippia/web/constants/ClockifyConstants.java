package lippia.web.constants;

public class ClockifyConstants {

    public static final String TEXT_LOGIN = "xpath://a[contains(.,'Log in manually')]";
    public static final String INPUT_EMAIL = "xpath://input[@id='email']";
    public static final String INPUT_PASSWORD = "xpath://input[@name='password']";
    public static final String BUTTON_LOGIN = "xpath://button[@type='submit']";
    public static final String INPUT_PLACEHOLDER = "xpath://input[@placeholder='What are you working on?']";
    public static final String BUTTON_PROFILE = "xpath://span[contains(.,'PS')]";
    public static final String BUTTON_LOGOUT = "xpath://a[@data-cy='logout']";
    public static final String BUTTON_WORKSPACE = "xpath://img[@alt='Workspace dropdown options']";
    public static final String TEXT_MANAGE = "xpath://a[@routerlink='/workspaces']";
    public static final String TEXT_BUTTON_CREATE_WORKSPACE = "xpath://button[@type='button'][contains(.,'Create new workspace')]";
    public static final String INPUT_NAME_WORKSPACE = "xpath://input[@formcontrolname='name']";
    public static final String BUTTON_CREATE = "xpath://button[@class='cl-btn cl-btn-primary']";
    public static final String LIST_WORKSPACE = "xpath://workspace-row[contains(.,'(Global')]";
    public static final String ALERT_TEXT_CONFIRM = "xpath:(//div[contains(.,'has been created')])[4]";
    public static final String ICON_DELETE_WORKSPACE = "xpath:(//img[@data-cy='delete-workspace'])[1]";
    public static final String INPUT_DELETE_WORKSPACE = "xpath://input[contains(@formcontrolname,'confirmationModel')]";
    public static final String BUTTON_DELETE_WORKSPACE = "xpath://*[contains(text(),' Delete Workspace')]";
    public static final String ALERT_CONFIRM_CREATE_PROJECT = "xpath://*[@id=\"toast-container\"]";
    public static final String ICON_PLUS = "xpath:(//img[@src='assets/ui-icons/plus-blue.svg'])[1]";
    public static final String TEXT_CREATE_NEW_PROJECT = "xpath://span[contains(.,'Create new project')]";
    public static final String INPUT_NAME_NEW_PROJECT = "xpath://input[@data-cy='project-name']\n";
    public static final String ICON_SECTION_PROJECT = "xpath://img[@alt='View Projects']";

    public static final String ICON_MENU_HAMBURGUER = "xpath:(//img[@alt='Edit menu dark theme'][1])" ;

    public static final String OPTION_ARCHIVE = "xpath://a[contains(.,'Archive')]";
    public static final String POP_UP_BUTTON_ARCHIVE = "xpath://button[contains(.,'Archive')]";
    public static final String OPTION_DELETE = "xpath://a[contains(.,'Delete')]";
    public static final String CONFIRM_BUTTON_DELETE = "xpath://button[contains(.,'Delete')]";
    public static final String CLOSE_POPUP_ALERT = "xpath://span[contains(.,'×')]";
    public static final String HOUR_FROM = "xpath:(//input[contains(@autocomplete,'off')])[2]";
    public static final String PRINCIPAL_TIME = "xpath:(//div[@class='cl-component-divided-left cl-single-date-picker ng-star-inserted'])[1]";
    public static final String HOUR_TO = "xpath:(//input[contains(@autocomplete,'off')])[3]";
    public static final String INPUT_DATE = "xpath:(//input[@type='text'])[4]";
    public static final String BUTTON_ADD_TIME = "xpath:(//button[contains(.,'Add')])[1]";
    public static final String OPTION_MANUAL_TIME = "xpath://img[@alt='Add time manually not selected']";
    public static final String ICON_TIME = "xpath://img[contains(@alt,'Track time using timer selected')]";

    public static final String START_BUTTON = "xpath:(//button[contains(.,'Start')])[1]";
    public static final String MENU_DRAWER_TIME = "xpath://img[@class='cl-px-2']";

    public static final String OPTION_DISCARD = "xpath://a[contains(.,'Discard')]";
    public static final String CONFIRM_OPTION_DISCARD = "xpath://button[@type='button'][contains(.,'Discard')]";
    public static final String TEXT_TIME_CANCELLED = "xpath://div[@aria-label='Timer cancelled']";
    public static final String INPUT_DESCRIPTION = "xpath://input[contains(@container,'body')]";
    public static final String NAME_PROJECT = "xpath://button[contains(@title,'Proyecto web TP FInal')]";

    public static final String INPUT_FROM_HOUR_EXIST = "xpath://*/single-date-picker2/div[1]/input-time-ampm[1]/input";
    public static final String INPUT_TO_HOUR_EXIST = "xpath://single-date-picker2/div[1]/input-time-ampm[2]/input";
    public static final String ICON_PLUS_PROJECT_EDIT = "xpath:(//img[@src='assets/ui-icons/plus-blue.svg'])[2]";

    public static final String TEXT_PROJECT_HAS_BEEN_UPDATED = "xpath:(//div[contains(.,'Project has been updated')])[4]";
    public static final String SELECT_NAME_PROJECT = "xpath:(//span[contains(.,'Proyecto TP FInal')])[2]";
    public static final String NO_PROJECT_NAME = "xpath://a[@tabindex='-1'][contains(.,'No project')]";



}
