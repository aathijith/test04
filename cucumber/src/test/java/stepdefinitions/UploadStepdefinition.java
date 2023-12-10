package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.Driver;

public class UploadStepdefinition extends HerokuappPage {
    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("user goes the website to upload")
    public void user_goes_the_website_to_upload() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/upload");
    }
    @Given("user uploads the file")
    public void user_uploads_the_file() {
        String filePath = "/Users/arif/Desktop/Selenium.pdf";
        herokuappPage.uploadButton.sendKeys(filePath);
        herokuappPage.submitButton.click();
    }
    @Then("user validates result")
    public void user_validates_result() {
        Assert.assertTrue(herokuappPage.resultText.isDisplayed());


    }

}
