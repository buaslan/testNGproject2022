package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.AddressLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day15_AddressLogin {
    AddressLoginPage addressLoginPage=new AddressLoginPage();
    @Test
    public void loginTest(){
//        going to the page
        Driver.getDriver().get(ConfigReader.getProperty("address_url"));
//        sending username
        addressLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));
//        sending password
        addressLoginPage.password.sendKeys(ConfigReader.getProperty("address_password"));
//        clicking on techproed.tests.smoketest.login button
        addressLoginPage.logInButton.click();
    }
}
