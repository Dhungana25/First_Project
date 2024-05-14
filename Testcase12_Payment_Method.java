package amazontest;
//not working
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import amazonsource.Amazon_Payment_Method_Page;
import amazonsource.Lunch_Quit;

public class Testcase12_Payment_Method extends Lunch_Quit{

	 @Test
	  public void select_payment_method() throws InterruptedException {
		 Amazon_Payment_Method_Page a1= new Amazon_Payment_Method_Page(driver);
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
	  Thread.sleep(2000);
	  a1.adding_carddetails();
	  Thread.sleep(5000);
	  a1.cancel();
	  Thread.sleep(3000);
	  ((JavascriptExecutor) driver).executeScript("scroll(0, 400);");
	  a1.amazon_card();
	  Thread.sleep(2000);
	  a1.personal_account();
	 // Assert.assertEquals(driver.getTitle(), "Amazon.com Checkout", "");
}
}