package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Sorting_Relevence_Price_Rating_page {
	
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

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_tf;
	public void search() {
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//span[@id='a-autoid-0-announce']")
	WebElement sorting_button;
	public void sort_btn() {
		sorting_button.click();
	}
	
	@FindBy(xpath="//a[.='Price: Low to High']")
	WebElement price_low_to_high;
	public void price_low_to_high() {
		price_low_to_high.click();
	}
	
	@FindBy(xpath="//a[.='Price: High to Low']")
	WebElement price_high_to_low;
	public void price_high_to_low() {
		price_high_to_low.click();
	}
	@FindBy(xpath="//a[@id='s-result-sort-select_3']" )   //"//a[.='Avg. Customer Review']")
	WebElement customer_review;
	
	public void customer_review() {
	customer_review.click();	
	}
	
	@FindBy(xpath="//a[.='Newest Arrivals']")
	WebElement new_arrival;
	public void new_arrivals() {
		new_arrival.click();
	}
	
	@FindBy(xpath="(//a[.='Best Sellers'])[2]")
	WebElement best_sellers;
	
	public void best_sellers() {
		best_sellers.click();
	}
	
	
	public Amazon_Sorting_Relevence_Price_Rating_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
}
