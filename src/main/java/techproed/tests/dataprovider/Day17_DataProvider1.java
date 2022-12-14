package techproed.tests.dataprovider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Day17_DataProvider1 {
    /*
    What is data provider?
    -Data provider is a testNG annotation
    -It is used to get list of test data
    -With data provider, we can get data from different files such as json or excel.
    -In out framework, I use data provider to get data from our excel sheet
    ++++++++++++++++++++++++++
    How do you pass a data from a method to a Test Method?
    -In the data provider method, I use @DataProvider annotation
    -In the test methods, I use dataProvider parameter and pass method name
    +++++++++++++++++++++++++++
     */
//    DATA PROVIDER METHOD
    @DataProvider
    public Object[][] customerData(){
        Object [][] customerCredentials = {
                {"customer@bluerentalcars.com","12345"},
                {"customer1@bluerentalcars.com","12346"},
                {"customer2@bluerentalcars.com","12347"},
                {"customer3@bluerentalcars.com","12348"},
        };
        return customerCredentials;
    }
    //    DATA PROVIDER METHOD
    @DataProvider(name = "adminLoginCredentials", parallel = false)
    public Object[][] adminData(){
        Object [][] customerCredentials = {
                {"admin@bluerentalcars.com","12345"},
                {"admin1@bluerentalcars.com","12346"},
                {"admin2@bluerentalcars.com","12347"},
                {"admin3@bluerentalcars.com","12348"},
        };
        return customerCredentials;
    }

    @DataProvider
    public Object [][] genData(){
        Object [][] customercredential = {
                {"gen@bluerentalcars.com","12345"}
        };
        return  customercredential;
    }
    //    TEST METHOD
    @Test(dataProvider = "customerData")
    public void dataProviderTest(String userName, String passWord){
        System.out.println("Username : "+userName+" ||| Password : "+passWord);
    }
    @Test(dataProvider = "adminData")
    public void customerLoginTest(String user,String pass){
        System.out.println(user +" ++++ "+ pass);
    }
    @Test(dataProvider = "genData")
public void genDataTest(String user,String pass){
        System.out.println(user +" +++ "+ pass);
    }
}
