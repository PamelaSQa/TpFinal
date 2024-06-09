package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static lippia.web.services.LoginService.*;
import static lippia.web.services.WorkspaceService.*;
import static lippia.web.services.WorkspaceResultService.*;

public class WorkspaceSteps extends PageSteps {

    @Given("the user is logged in with valid email and password")
    public void loginSuccesfully(){
        navigateWeb();
        clickTextLogin();
        sendLoginCredential();
        clickButtonLogin();
    }

    @And("click on workspace")
    public void clickOnWorkspace() {
        clickButtonWorkspace();
    }

    @And("click manage")
    public void clickManage() {
        clickButtonManage();
    }

    @And("click create new workspace")
    public void clickCreateNewWorkspace() {
        buttonCreateNewWorkspace();
    }

    @And("enter a name for the workspace")
    public void enterANameForTheWorkspace() {
        sendNameWorkspaceRandom();
    }

    @When("click on the create button")
    public void clickOnTheCreateButton()  {
        clickButtonCreate();
    }

    @Then("the new workspace is displayed in the workspace")
    public void theNewWorkspaceIsDisplayedInTheWorkspace() {
        validateWorkspaceCreation();
        deleteWorkspace();
    }
}
