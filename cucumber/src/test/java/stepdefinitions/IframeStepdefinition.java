package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HerokuappPage;
import utilities.Driver;

public class IframeStepdefinition extends HerokuappPage {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("user goes to the website to handle iframe")
    public void user_goes_to_the_website_to_handle_iframe() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
    }

    @Given("user switchs to iframe")
    public void user_switchs_to_iframe() {
        Driver.getDriver().switchTo().frame(herokuappPage.iframe);
    }

    @Given("user writes something in textbox")
    public void user_writes_something_in_textbox() {
        herokuappPage.textBox.clear();
        herokuappPage.textBox.sendKeys("Hello World");

    }

}
