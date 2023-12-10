package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "file-upload")
    public WebElement uploadButton;

    @FindBy (id="file-submit")
    public WebElement submitButton;

    @FindBy(tagName = "h3")
    public WebElement resultText;

    @FindBy(xpath = "//a[.='Screenshot.png']")
    public WebElement file;

    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(tagName = "p")
    public WebElement textBox;

    @FindBy(id = "dropdown")
    public WebElement dropdown;

}
