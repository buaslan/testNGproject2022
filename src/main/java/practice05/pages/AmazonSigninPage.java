package practice05.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.security.PublicKey;

public class AmazonSigninPage {

    public AmazonSigninPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement signinTab;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id="continue")
    public WebElement continueButton;

    @FindBy(xpath = "//span[@class='a-list-item']")
    public WebElement waerningMessage;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(id="auth-fpp-link-bottom")
    public WebElement forgotPassword;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy(id= "createAccountSubmit")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h1[@class='a-spacing-small']")
    public WebElement createAccountText;


}
