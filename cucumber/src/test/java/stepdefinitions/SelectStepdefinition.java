package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.HerokuappPage;
import utilities.Driver;

public class SelectStepdefinition extends HerokuappPage {
    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("user goes to the website to select")
    public void user_goes_to_the_website_to_select() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dropdown");
    }
    @Given("user select second option")
    public void user_select_second_option() {
        Select select= new Select(herokuappPage.dropdown);
        select.selectByValue("2");
    }
}
