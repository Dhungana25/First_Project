package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Product_details_page {
	FirefoxDriver  driver;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email_tf;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password_tf;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin_button;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	WebElement login_button;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_tf;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
	WebElement first_product;
	
	@FindBy(xpath="//div[@id='corePrice_feature_div']")
	WebElement price;
	
	@FindBy(xpath="//div[@id='averageCustomerReviews']")
	WebElement ratings;
	
	
	@FindBy(xpath="//div[@id='productDescription_feature_div']")
	WebElement product_description;
	
	
	
	
	//Step2
	
	public void email() {
		email_tf.sendKeys("sarmila.mehta73@gmail.com");
		
	}
	
	public void cnt() {
		continue_button.click();
		
	}
	
	public void password() {
		password_tf.sendKeys("Amazon#123");
		
	}
	
	public void signin() {
		signin_button.click();
	}
	
	public void login() {
		login_button.click();
	}
	
	public void search() {
		search_tf.sendKeys("mobile");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	public void first_mobile() {
		first_product.click();
	}
	
	public void price() {
		Assert.assertEquals(price.isDisplayed(),true);
	}
	
	public void rating() {
	Assert.assertEquals(ratings.isDisplayed(), true);	
	}
   
	public void prd_description() {
		Assert.assertEquals(product_description.isDisplayed(), true);
	}
	
	//Step3
	
	public  Amazon_Product_details_page(WebDriver driver2)
	{
		PageFactory.initElements(driver2, this);
	}
}
