package NeoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxLginPOMclass 
{
	@FindBy (xpath="(//input[@type='number'])[1]")private WebElement mobNoTextField;
	@FindBy (xpath="//*[@id=\"lnk_signup1\"]")private WebElement signInButton;
	@FindBy (xpath="//*[@id=\"txt_accesspin\"]")private WebElement passwordTextField;
	@FindBy (xpath="//*[@id=\"lnk_submitaccesspin\"]")private WebElement submitButton;

	public NeoStoxLginPOMclass (WebDriver driver) 
{
	PageFactory.initElements(driver, this);	
}
	public void EnterMobileNo(String num) 
	{
		mobNoTextField.sendKeys(num);
	}
	public void ClickOnSignButton() 
	{
		signInButton.click();
	}
	public void EnterPassword(String Pass)
	{
		passwordTextField.sendKeys(Pass);
	}
	public void ClickOnSubmitButton() 
	{
		submitButton.click();
	}
}