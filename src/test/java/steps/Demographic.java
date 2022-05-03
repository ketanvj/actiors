package steps;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class Demographic {
  String personNameToSearchBy ;
  static HomePage homePage;

  static Playwright playwright;
  static Browser browser;
  static Page page;




  @BeforeAll
  public static void setUp() {
    playwright = Playwright.create();
    browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
    page = browser.newPage();
    homePage = new HomePage(page);
  }
  @Given("A person name {string}")
  public void a_person_name(String personNameToSearchBy) {
    // Write code here that turns the phrase above into concrete actions
    this.personNameToSearchBy = personNameToSearchBy;
  }
  @When("A fan searches for  it")
  public void a_fan_searches_for_it() {
    // Write code here that turns the phrase above into concrete actions

    homePage.searchByName(personNameToSearchBy);
  }
  @Then("display all persons matching the name")
  public void display_all_persons_matching_the_name() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Then("each result should display image, full name")
  public void each_result_should_display_image_full_name() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Then("there is an option to view other details")
  public void there_is_an_option_to_view_other_details() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
}
