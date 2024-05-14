package amazontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Login_With_Email_InvalidPassword;
import amazonsource.Lunch_Quit;

public class Testcase3_Amazon_login_IncorrectEID_PWD extends Lunch_Quit {
	@Test
	public void login_invalid_email_password() {
	Amazon_Login_With_Email_InvalidPassword a1= new Amazon_Login_With_Email_InvalidPassword(driver);
	a1.email();
	a1.cnt();
	a1.password();
	a1.signin();
	Assert.assertEquals(driver.getTitle(), "Amazon Sign-In", "");
	
	
	}
}
