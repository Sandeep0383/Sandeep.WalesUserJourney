package qa.nhs.com.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import qa.nhs.com.driver.DriverFactory;
import qa.nhs.com.pageObject.SearchPageObject;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef extends DriverFactory
{
    private SearchPageObject searchPageObject = new SearchPageObject();

    @Given("^I am a person from Wales$")
    public void iAmAPersonFromWales()
    {
      searchPageObject.setSearchMethod();
    }

    @When("^I put my circumstances into the Checker tool$")
    public void iPutMyCircumstancesIntoTheCheckerTool()
    {
      searchPageObject.enterDOB();
      searchPageObject.liveWithPartner();
      searchPageObject.partnerClaimAnyBenefits();
      searchPageObject.givenBirthInLast12Mounts();
      searchPageObject.injuryOrIllness();
      searchPageObject.diabetes();
      searchPageObject.glacoma();
      searchPageObject.partnerLivePermanentlyInCareHome();
      searchPageObject.partnerHaveMoreThan£16000();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void iShouldGetAResultOfWhetherIWillGetHelpOrNot()
    {
        String actual = searchPageObject.setResultHeader();
        System.out.println(actual);
        assertThat("you will not get help with nhs. " , actual, Matchers.endsWith("You get help with NHS costs"));
    }
}
