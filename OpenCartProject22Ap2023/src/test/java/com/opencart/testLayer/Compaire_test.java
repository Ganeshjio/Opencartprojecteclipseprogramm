package com.opencart.testLayer;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.opencart.pageLayer.Homepage;
import com.opencart.pageLayer.Loginpage;
import com.opencart.pageLayer.Searchpage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class Compaire_test extends TestBase{
	@Test
	public void ValidateAddingtheproductforComparisionfromProductDisplayPage() throws InterruptedException
	{
		String expected_output = "My Account";
		Homepage homepage_obj = new Homepage(driver);
		Loginpage login_obj = new Loginpage(driver);
		Searchpage search_obj = new Searchpage(driver);
		UtilClass util_obj = new UtilClass(driver);

		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
		
		Thread.sleep(2000);
		login_obj.enterEmail("davidmiller1@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
	    search_obj.searchText("macbook");
	    Thread.sleep(2000);
	    search_obj.searchButton();
	    Thread.sleep(2000);
	    search_obj.compaireproductlist();
	    Thread.sleep(2000);
	    search_obj.productmacbook();
	    Thread.sleep(2000);
	    search_obj.productmacbookair();
	    Thread.sleep(2000);
	    search_obj.productcompaire();
	    Thread.sleep(2000);
		Assert.assertEquals(util_obj.getTitleOfPage(), expected_output);	
	}
	
	/*@Test
	public void validateloggingintotheApplicationusinginvalidcredentials() throws InterruptedException
	{
		String expected_output = "Account Login";
		Homepage homepage_obj = new Homepage(driver);
		Loginpage login_obj = new Loginpage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
		
		Thread.sleep(2000);
		login_obj.enterEmail("davidmiller8@gmail.com");
		login_obj.enterPassword("Test1234rtfd");
		login_obj.clickOnLoginButton();
		
		Assert.assertEquals(util_obj.getTitleOfPage(), expected_output);	
		
	}*/
}

