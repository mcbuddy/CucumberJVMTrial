package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
//    public static WebDriver driver;

    @Given("^I at google search homepage$")
    public void iAtGoogleSearchHomepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.store.demoqa.com");
    }

    @Then("^I should see \"([^\"]*)\" search result$")
    public void iShouldSeeSearchResult(String keyword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

//        throw new PendingException();

    }

    @When("^I search for \"([^\"]*)\" keyword$")
    public void iSearchForKeyword(String keyword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @And("^I should see \"([^\"]*)\" official homepage$")
    public void iShouldSeeOfficialHomepage(String keyword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
