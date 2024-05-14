package amazontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_fivestar_Rating_On_LastOrder_Page;
import amazonsource.Lunch_Quit;

public class Testcase14_Rating extends Lunch_Quit {
  @Test
  public void fivestar_rating() throws InterruptedException {
	  Amazon_fivestar_Rating_On_LastOrder_Page r1= new Amazon_fivestar_Rating_On_LastOrder_Page(driver);
	  r1.email();
	  r1.cnt();
	  r1.password();
	  r1.signin();
	  r1.login();
	  r1.account_list();
	  Thread.sleep(2000);
	  r1.your_order();
	  Assert.assertEquals(driver.getTitle(), "Your Orders", "");
	  
	  
	  
  }
	
}
