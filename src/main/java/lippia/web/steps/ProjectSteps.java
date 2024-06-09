package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.ProjectResultService.validateProjectCreated;
import static lippia.web.services.ProjectService.*;

public class ProjectSteps extends PageSteps {

    @And("then click on the plus icon")
    public void thenClickOnThePlusIcon(){
        clickOnTheIconPlus();
    }

    @And("click create new project")
    public void clickCreateNewProject() {
        clickOptionCreateNewProject();
    }

    @When("enter the name for the new project")
    public void EnterTheNameForTheNewProject() {
        enteredNameProject();
    }

    @Then("the project creation is validated with the message")
    public void theProjectCreationIsValidatedWithTheMessage() {
        validateProjectCreated();
        deleteProject();
    }
}
