package amazontest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Checkout_Address_Selection_Payment_page;
import amazonsource.Lunch_Quit;

public class Testcase11_Validating_Entire_Checkout_process extends Lunch_Quit {
   @Test
  public void validating() throws InterruptedException {
  Amazon_Checkout_Address_Selection_Payment_page a1= new Amazon_Checkout_Address_Selection_Payment_page(driver);
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
  Thread.sleep(3000);
  a1.edit();
  Thread.sleep(3000);
  a1.close();
  Thread.sleep(2000);
  a1.address();
  Thread.sleep(2000);
 /* a1.adding_carddetails();
  Thread.sleep(3000);
  a1.cancel();
  Thread.sleep(3000);*/
  Assert.assertEquals(driver.getTitle(), "Amazon.com Checkout", "");
  



} 
}
