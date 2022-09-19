package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day14_FirstDriverClass {
    @Test
    public void firstDriver(){
        Driver.getDriver().get("https://techproeducation.com/");

        Driver.closeDriver();
    }
}
