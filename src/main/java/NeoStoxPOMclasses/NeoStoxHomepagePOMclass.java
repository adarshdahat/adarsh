package NeoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomepagePOMclass 
{
	@FindBy (xpath="//*[@id=\"lbl_username\"]")private WebElement username;
	@FindBy (xpath="//*[@id=\"lbl_curbalancetop\"]")private WebElement balance;

	public  NeoStoxHomepagePOMclass (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUsername() 
	{
		String UN = username.getText();
		return UN;
	}
	public String getFunds() 
	{
		String avlBalance = balance.getText();
		return avlBalance;
	}
}