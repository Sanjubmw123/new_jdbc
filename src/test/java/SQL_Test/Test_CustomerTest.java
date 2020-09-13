package SQL_Test;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import SQL_Page.CustomerPage;
import SQL_Page.Database;
import SQL_Util.browser;

public class Test_CustomerTest {
WebDriver driver;
CustomerPage customer;
Database database;

public void Testing(String userName ,String password,String name ,String company,String email ,String phone ,String address,String city ,String state,String zip ) throws InterruptedException {
	driver=browser.startBrowser();
	customer=PageFactory.initElements(driver,CustomerPage.class);
	database=PageFactory.initElements(driver,Database.class );
	customer.enterusername(userName);
	customer.enterpassword(password);
	customer.signin();
	customer.CustomerElement();
	customer.AddCustomerElement();
	customer.ListCustomerElement();
	customer.Groups_Element();
	customer.Full_name(name);
	customer.Company_Element(company);
	customer.emailElement(email);
	customer.Phone_Element(phone);
	customer.Address_Element(address);
	customer.City_Element(city);
	customer.StateELement(state);
	customer.Zip_Element(zip);
}
}
