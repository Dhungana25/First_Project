package amazontest;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Adding_Product_To_Cart_Page;

public class Testcase15_Adding_Product {
	@Test
	  public void cart_page() throws InterruptedException {
		  FirefoxDriver driver= new FirefoxDriver();
		  driver.navigate().to("https://www.amazon.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		  
		  Adding_Product_To_Cart_Page c1= new Adding_Product_To_Cart_Page(driver);
		  c1.search();
		  c1.first_product();
		  Thread.sleep(1000);
		  ((JavascriptExecutor) driver).executeScript("scroll(0, 360);");
		  Thread.sleep(2000);
		  c1.addto_cart_button();
		  
		  Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart", "");
		  
		  
}
}