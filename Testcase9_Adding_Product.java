package amazontest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Add_Shoppingcart_From_Product_page;
import amazonsource.Lunch_Quit;

public class Testcase9_Adding_Product extends Lunch_Quit {
  @Test
  public void Adding_Product() throws InterruptedException {
	  Add_Shoppingcart_From_Product_page a1= new Add_Shoppingcart_From_Product_page(driver);
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
	  Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart", "");
	  
	  
  }
}
