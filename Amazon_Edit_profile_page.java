package amazonsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Edit_profile_page {
	FirefoxDriver driver;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email_tf;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password_tf;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin_button;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement account_and_lists;
	
	@FindBy(xpath="(//div[@class='a-box ya-card--rich'])[8]")
	WebElement my_profile_box;
	
	@FindBy(xpath="(//div[@class='a-column a-span11 a-spacing-base aok-break-word'])[1]")
	WebElement active_profile ;
	
	@FindBy(xpath="//span[@id='name-edit-button']")
	WebElement name_edit;
	
	@FindBy(xpath="//input[@id='profile-name-text-input']")
	WebElement name_tf;
	
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement save_change;
	
	
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
	
	public void account_list() {
		account_and_lists.click();
	}
	
	public void profile() {
		my_profile_box.click();
	}
	
	public void nametf() {
		active_profile.click();
	}
	
	public void edit_name() {
		name_edit.click();
	}
	
	public void name() {
		name_tf.sendKeys(" Dhungana");
	}
	public void save_button() {
		save_change.click();
	}
	//step3
	
	public Amazon_Edit_profile_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
