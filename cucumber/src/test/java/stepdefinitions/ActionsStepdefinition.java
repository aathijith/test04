package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DemoqaPage;
import utilities.Driver;

public class ActionsStepdefinition extends DemoqaPage {
    DemoqaPage demoqaPage = new DemoqaPage();

    @Given("user goes the website to drag and drop")
    public void user_goes_the_website_to_drag_and_drop() {
        Driver.getDriver().get("https://demoqa.com/droppable");
    }

    @Given("user drags and drops")
    public void user_drags_and_drops() {
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(demoqaPage.dragme,demoqaPage.drophere).perform();
    }

    @Then("user validates result for testing")
    public void user_validates_result_for_testing() {
        Assert.assertTrue(demoqaPage.resultText.isDisplayed());
    }

}
