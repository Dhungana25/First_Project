package amazontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Search_Product_page;
import amazonsource.Lunch_Quit;

public class Testcase5_Search_Product extends Lunch_Quit {
	@Test
	
	public void Searching_Product() throws InterruptedException {
		Amazon_Search_Product_page a1= new Amazon_Search_Product_page(driver);
		a1.email();
		a1.cnt();
		a1.password();
		a1.signin();
		a1.login();
		a1.search();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Amazon.com : shoe", "");
	}

}
