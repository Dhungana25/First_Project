package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Searching_With_Filter_page {
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
	
	
	@FindBy(xpath="//span[.='Cell Phones']")
	WebElement cellphone_button;
	
	@FindBy(xpath="//span[.='$250 to $400']")
	WebElement price_range;
	
	
	
	
	//step2
	
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
	
		
	public void cell_phone() {
		cellphone_button.click();
	}
	
	public void price() {
		price_range.click();
	}
	
	//step3
	
	public Amazon_Searching_With_Filter_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
