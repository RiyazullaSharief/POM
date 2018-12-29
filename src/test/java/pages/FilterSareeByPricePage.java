package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FilterSareeByPricePage
{
	int i=1;
	public WebDriver driver;
	@FindBy(xpath="//a[.='SAREES']")
	private WebElement sarees;
	
	public FilterSareeByPricePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSarees()
	{
		sarees.click();
	}
	
	public void verifyAppOpened(String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		if(i<=1)
		{
			Reporter.log("Welcome to www.craftsvilla.com",true);
			i++;
		}
		else if(i>=2)
		{
			Reporter.log("...!!",true);
		}
	}
}
