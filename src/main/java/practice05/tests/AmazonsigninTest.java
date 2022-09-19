package practice05.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice05.pages.AmazonSigninPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonsigninTest {


    AmazonSigninPage amazonSigninPage = new AmazonSigninPage();

    @Test
    public void amazonsigninTest() {

//       Go to the Amazon website
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

//        Click on sign in button
        amazonSigninPage.signinTab.click();

//        Send e mail by using faker
        amazonSigninPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());

//        Click on continue
        amazonSigninPage.continueButton.click();

//        Assert "There was a problem"  message
        String warningmessagetext = amazonSigninPage.waerningMessage.getText();
        Assert.assertEquals(warningmessagetext, "We cannot find an account with that email address");

//        Click on "Need help?"
        amazonSigninPage.needHelp.click();

//        Click on "Forgot your Password?"
        amazonSigninPage.forgotPassword.click();

//        Verify the text "Password assistance"
        boolean isPassDisplayed = amazonSigninPage.passwordAssistance.isDisplayed();
        Assert.assertTrue(isPassDisplayed);

//        Navigate back
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

//        Click on "Create your account" button
        amazonSigninPage.createAccountButton.click();

//        Verify the text "Create account"
        String createAccountText = amazonSigninPage.createAccountText.getText();
        Assert.assertEquals(createAccountText, "Create account");
    }
}
