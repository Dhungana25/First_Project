package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Updating_Quantities_And_Removing_page {

	FirefoxDriver driver;
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

	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add_to_cart_button;
	
	@FindBy(xpath="(//span[.=' No Thanks '])[3]")
	WebElement nothanks_button;
	
	@FindBy(xpath="//span[@id='sw-gtc']")
	WebElement go_to_cart_button;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	WebElement quantites;
	
	@FindBy(linkText="2")
	WebElement number;
	
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement delete;
	
	
	
	
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
	
	public void addto_cart() {
		add_to_cart_button.click();
	}
	
	public void nothanks() {
		nothanks_button.click();
	}
	
	public void goto_cart() {
		go_to_cart_button.click();
	}
	
	public void qty() {
		quantites.click();
	}
	
	public void number() {
		number.click();
	}
	
	public void delete() {
		delete.click();
	}
	
	
	//Step3
	
	public Amazon_Updating_Quantities_And_Removing_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
