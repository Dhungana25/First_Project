package amazontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonsource.Amazon_Edit_profile_page;
import amazonsource.Lunch_Quit;

public class Testcase4_Editprofile extends Lunch_Quit{
	@Test
	public void Edit_profile() throws InterruptedException {
		Amazon_Edit_profile_page a1= new Amazon_Edit_profile_page(driver);
		a1.email();
		a1.cnt();
		a1.password();
		a1.signin();
		a1.account_list();
		a1.profile();
		a1.nametf();
		Thread.sleep(1000);
		a1.edit_name();
		Thread.sleep(1000);
		a1.name();
		Thread.sleep(1000);
		a1.save_button();
		Assert.assertEquals(driver.getTitle(), "Sarmila Dhungana", "");
	}

}
