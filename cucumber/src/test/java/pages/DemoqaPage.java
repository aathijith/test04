package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[text()='Drag me']")
    public WebElement dragme;

    @FindBy(xpath = "(//p[text()='Drop here'])[1]")
    public WebElement drophere;

    @FindBy(xpath = "(//p[text()='Dropped!'])[1]")
    public WebElement resultText;
}
