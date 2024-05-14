package amazonsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_fivestar_Rating_On_LastOrder_Page {
	FirefoxDriver driver;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email_tf;
	
	public void email() {
		email_tf.sendKeys("sarmila.mehta73@gmail.com");
		
	}
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_button;
	public void cnt() {
		continue_button.click();
		
	}
	
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password_tf;
	public void password() {
		password_tf.sendKeys("Amazon#123");
		
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin_button;
	public void signin() {
		signin_button.click();
	}
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	WebElement login_button;
	public void login() {
		login_button.click();
	}
	
	
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement account_and_lists;
	public void account_list() {
		account_and_lists.click();
	}
	
	@FindBy(xpath="(//div[@class='a-box ya-card--rich'])[1]")
	WebElement your_order;
	public void your_order() {
		your_order.click();
	}
	
	public Amazon_fivestar_Rating_On_LastOrder_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
}
