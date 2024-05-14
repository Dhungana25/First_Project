package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CuponCode_Apply_page {
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
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_checkout;
    
	
	@FindBy(linkText="Change")
	WebElement change;
	
	@FindBy(linkText="Edit address")   // "(//span[@class='a-declarative'])[11]")
	WebElement edit_button;
	
	@FindBy(xpath="//button[@class=' a-button-close a-declarative']")  //(//button[@class=' a-button-close a-declarative'])[2]")
	WebElement close_button;
	
	@FindBy(xpath="//span[@id='shipToThisAddressButton']")
	WebElement usethis_address;
	
	@FindBy(xpath="//input[@name='ppw-claimCode']")
	WebElement giftcard_promocode_tf;
	
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
	WebElement apply_button;
	
	
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
	
	public void first_mobile() {
		first_product.click();
	}
	
	public void addto_cart() {
		add_to_cart_button.click();
	}
	
	public void nothanks() {
		nothanks_button.click();
	}
	
	public void checkout() {
		proceed_to_checkout.click();
		
	}
	
	 public void change() {
		  change.click();
	  }

	
	public void edit() {
		edit_button.click();
		
	}
	
	public void close() {
		close_button.click();
		
	}
	
  public void address() {
	  usethis_address.click();
  }
  
  public void enter_code() {
	  giftcard_promocode_tf.sendKeys("56487"); 
  }
  
  public void apply_button() {
	  apply_button.click();
  }
  
  //Step3
  
  public Amazon_CuponCode_Apply_page(WebDriver driver)
	
	{  PageFactory.initElements(driver, this);
		
		
	}
}
