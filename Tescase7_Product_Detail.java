package amazontest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Product_details_page;
import amazonsource.Lunch_Quit;


public class Tescase7_Product_Detail extends Lunch_Quit{
   @Test
   public void Searching_Product_detail() throws InterruptedException {
	   Amazon_Product_details_page a1= new Amazon_Product_details_page(driver);
	   a1.email();
	   a1.cnt();
	   a1.password();
	   a1.signin();
	   a1.login();
	   a1.search();
	   a1.first_mobile();
	   Thread.sleep(2000);
	   a1.price();
	   Thread.sleep(2000);
	   a1.rating();
	   ((JavascriptExecutor) driver).executeScript("scroll(0, 5400);");
	   a1.prd_description();
	   Assert.assertEquals(driver.getTitle(), "Amazon.com: EMUPER Smartphone Unlocked Cell Phone IP15pro 6.7inch 4GB/128GB HD Incell Screen Android 11 Real Straight Talk Phone 5000mAh Dual Sim Boost Mobile Phones Real Unlocked (Blue) : Cell Phones & Accessories", "");

	   
   }
	
	  
}
