package amazontest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Searching_With_Filter_page;
import amazonsource.Lunch_Quit;

public class Testcase6_Using_Filter_search extends Lunch_Quit {
  @Test
  public void Searching_Product_With_Filter() throws InterruptedException {
	  Amazon_Searching_With_Filter_page a1= new Amazon_Searching_With_Filter_page(driver);
	  a1.email();
	  a1.cnt();
	  a1.password();
	  a1.signin();
	  a1.login();
	  a1.search();
	  Thread.sleep(2000);
	  a1.cell_phone();
	  ((JavascriptExecutor) driver).executeScript("scroll(0, 360);");
	  Thread.sleep(3000);
	  a1.price();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(), "Amazon.com : mobile", "");
	  
  }
	  
}
