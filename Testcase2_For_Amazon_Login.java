package amazontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Login_Page;
import amazonsource.Lunch_Quit;

public class Testcase2_For_Amazon_Login extends Lunch_Quit{
	@Test
	public void Login_To_Amazon_Email() {
		/*FirefoxDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flog%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));*/
		Amazon_Login_Page a1= new Amazon_Login_Page(driver);
		a1.email();
		a1.cnt();
		a1.password();
		a1.signin();
		
		Assert.assertEquals(driver.getTitle(),"Amazon.com : log in", "");	
		
	}

}
