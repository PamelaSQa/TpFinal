package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.TimeTrackerService.*;
import static lippia.web.services.WorkspaceResultService.validateTextHasBeenCreated;


public class TimeTrackerSteps extends PageSteps {

    @When("enter start time (.*)")
    public void enterStarTime(String starTime) {
        setStarTime(starTime);
    }

    @And("enter time (.*)")
    public void enterTimeEndTime(String endTime) {
        setEndTime(endTime);
    }

    @Then("new time is added to list of this week")
    public void newTimeIsAddedToListOfThisWeek() {
        validateTextHasBeenCreated();

    }

    @And("enter date (.*)")
    public void enterDateDate(String date) {
        setDate(date);
    }

    @And("click on ADD button")
    public void clickOnADDButton() {
        clickAddButton();
    }

    @When("click on timer icon for change mode")
    public void clickOnTimerIconForChangeMode() {
        clickIconTime();
    }

    @And("click on START button")
    public void clickOnSTARTButton() {
        clickOnStartButton();
    }

    @And("click on icon options")
    public void clickOnIconOptions() {
        clickMenuDrawerTime();
    }

    @And("click on Discard")
    public void clickOnDiscard() {
        clickButtonDiscard();
    }

    @And("click on DISCARD for confirmation")
    public void clickOnDISCARDForConfirmation() {
        clickConfirmDiscard();
    }

    @Then("time is not add to list")
    public void timeIsNotAddToList() {
        validateHoursNotLogged();
    }

    @When("modify the entry already existent description (.*), start time (.*), end time (.*)")
    public void modifyTheEntryAlreadyExistentNameNameProjectProjectStartTimeStartTimeEndTimeEndTime(String description, String startTime, String endTime) {
        updateExistingTimeEntries(description, startTime, endTime);
    }

    @Then("The data is modified by viewing the confirmation")
    public void theDataIsModifiedByViewingTheConfirmation() {
        validateLoggerHasBeenUpdated();
    }

    @And("modify project")
    public void modifyProject() {
        modifyProjectSelected();
    }


}
