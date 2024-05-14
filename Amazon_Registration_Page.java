package amazonsource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Registration_Page {
//finding the element by using @FindBy annotation
	FirefoxDriver driver;
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement firstname_lastnametf;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement mobileno_emailtf;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwordtf;
	
	@FindBy(xpath="//input[@id='ap_password_check']")
	WebElement password_resettf;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_button;
	
	//seperating each method to perform its action
	
	public void fullname() {
		firstname_lastnametf.sendKeys("Sarmila Dhungana");
	}
	
	public void emailORmobiletf() {
		mobileno_emailtf.sendKeys("sarmila.mehta73@gmail.com");
	}
	
	public void passwordtf() {
		passwordtf.sendKeys("Amazon#123");
		
	}
	
	public void reenterpwd() {
		password_resettf.sendKeys("Amazon#123");
		
	}
	
	public void cnt() {
		continue_button.click();
	}

	//initilizing the element using pagefactory class inside the constructor
	
	public Amazon_Registration_Page(FirefoxDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
