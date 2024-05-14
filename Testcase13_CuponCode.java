package amazontest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_CuponCode_Apply_page;
import amazonsource.Amazon_Payment_Method_Page;
import amazonsource.Lunch_Quit;

public class Testcase13_CuponCode extends Lunch_Quit{
	
	 @Test
	  public void cupon_code() throws InterruptedException {
		 Amazon_CuponCode_Apply_page a1= new Amazon_CuponCode_Apply_page(driver);
	  a1.email();
	  a1.cnt();
	  a1.password();
	  a1.signin();
	  a1.login();
	  a1.search();
	  Thread.sleep(2000);
	  a1.first_mobile();
	  ((JavascriptExecutor) driver).executeScript("scroll(0, 260);");
	  Thread.sleep(2000);
	  a1.addto_cart();
	  Thread.sleep(2000);
	  a1.nothanks();
	  Thread.sleep(1000);
	  a1.checkout();
	  Thread.sleep(5000);
	  a1.change();
	  Thread.sleep(3000);
	  a1.edit();
	  Thread.sleep(3000);
	  a1.close();
	  Thread.sleep(3000);
	  a1.address();
	  ((JavascriptExecutor) driver).executeScript("scroll(0, 360);");
	  Thread.sleep(3000);
	  a1.enter_code();
	  Thread.sleep(2000);
	  a1.apply_button();
	  
	  Assert.assertEquals(driver.getTitle(), "Amazon.com Checkout", "");
}
}