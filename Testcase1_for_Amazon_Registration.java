package amazontest;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import amazonsource.Amazon_Registration_Page;

public class Testcase1_for_Amazon_Registration {
  @Test
  public void Registration_for_Amazon() {
	  FirefoxDriver driver= new FirefoxDriver();
	  driver.navigate().to("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  Amazon_Registration_Page a1=new Amazon_Registration_Page(driver);
	  a1.fullname();
	  a1.emailORmobiletf();
	  a1.passwordtf();
	  a1.reenterpwd();
	  a1.cnt();
	  
	  
  }
}
