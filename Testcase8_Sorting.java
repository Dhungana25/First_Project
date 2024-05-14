package amazontest;

import org.testng.annotations.Test;

import amazonsource.Amazon_Sorting_Relevence_Price_Rating_page;
import amazonsource.Lunch_Quit;

public class Testcase8_Sorting extends Lunch_Quit{
	@Test
	public void sorting() throws InterruptedException {
		Amazon_Sorting_Relevence_Price_Rating_page s1= new Amazon_Sorting_Relevence_Price_Rating_page(driver);
		s1.email();
		s1.cnt();
		s1.password();
		s1.signin();
		s1.login();
		s1.search();
		Thread.sleep(2000);
		s1.sort_btn();
		Thread.sleep(2000);
		s1.price_low_to_high();
		s1.sort_btn();
		Thread.sleep(2000);
		s1.price_high_to_low();
		Thread.sleep(3000);
		s1.sort_btn();
		s1.customer_review();
		Thread.sleep(3000);
		s1.sort_btn();
		s1.new_arrivals();
		Thread.sleep(3000);
		s1.sort_btn();
		Thread.sleep(3000);
		s1.best_sellers();
		
		
	}

}
