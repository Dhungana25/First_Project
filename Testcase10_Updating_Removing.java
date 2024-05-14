package amazontest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import amazonsource.Amazon_Updating_Quantities_And_Removing_page;
import amazonsource.Lunch_Quit;

public class Testcase10_Updating_Removing extends Lunch_Quit{
	@Test
	  public void Updating_Removing() throws InterruptedException {
		 Amazon_Updating_Quantities_And_Removing_page a1= new  Amazon_Updating_Quantities_And_Removing_page(driver);
		  a1.email();
		  a1.cnt();
		  a1.password();
		  a1.signin();
		  a1.login();
		  a1.search();
		  Thread.sleep(2000);
		  a1.first_mobile();
		  ((JavascriptExecutor) driver).executeScript("scroll(0, 260);");
		  Thread.sleep(3000);
		  a1.addto_cart();
		  Thread.sleep(2000);
		  a1.nothanks();
		  Thread.sleep(2000);
		  a1.goto_cart();
		  Thread.sleep(2000);
		  a1.qty();
		  Thread.sleep(2000);
		  a1.number();
		  Thread.sleep(2000);
		  a1.delete();
		  Thread.sleep(2000);
		 Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart", "");
		  

}
}