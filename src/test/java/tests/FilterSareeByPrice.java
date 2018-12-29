package tests;

import org.testng.annotations.Test;

import pages.FilterSareeByPricePage;

public class FilterSareeByPrice extends BaseClass
{
	@Test
	public void filterSareeByPrice() throws InterruptedException
	{
		FilterSareeByPricePage fs=new FilterSareeByPricePage(driver);
		//fs.verifyAppOpened("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
		//Thread.sleep(3000);
		//fs.clickOnSarees();
	}
}
