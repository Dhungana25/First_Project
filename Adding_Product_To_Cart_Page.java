package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adding_Product_To_Cart_Page {
	FirefoxDriver driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_tf;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement first_product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addto_cart;
	
	
	
	
	//step2
	
	public void search() {
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	public void first_product() {
		first_product.click();
	}
	
	public void addto_cart_button() {
		addto_cart.click();
	}
	
	//step3
	
	public Adding_Product_To_Cart_Page (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	
	}
}
