package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.GoogleHomeService;
import lippia.web.services.GoogleSearchResultService;

import static lippia.web.services.LoginService.navegarWeb;

public class GoogleSearchSteps extends PageSteps {

    @Given("^The client is on google page$")
    public void home() {
        navegarWeb();
    }


    @When("^The client search for word(.*)$")
    public void search(String criteria) {
        GoogleHomeService.enterSearchCriteria(criteria);
        GoogleHomeService.clickSearchButton();
    }


    @Then("The client verify that results are shown properly")
    public void statVerification() {
        GoogleSearchResultService.verifyResults();
    }
//    public void isNotHome() {
//        GoogleHomeService.navegarWeb();
//        throw new RuntimeException("the client is not on google page");
//    }

//    @Given("^The client search for word$")
//    public void search(String criteria) {
//        GoogleHomeService.enterSearchCriteria(criteria);
//        GoogleHomeService.clickSearchButton();
//    }



}
