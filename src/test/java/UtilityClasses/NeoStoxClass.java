package UtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NeoStoxClass 
{
	public static String ReadDataFromPropertyFile(String key) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream myFile = new FileInputStream("D:\\Eclipse\\eclipse\\Workspace\\NeoStoxInvestmentBanking\\NeoStox.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
	public static void ScreenShot(WebDriver driver) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Selenium.png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
	public static void ScrollIntoView(WebDriver driver, WebElement element ) 
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView");
	}
	
	public static void wait(WebDriver driver, int time) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
}
