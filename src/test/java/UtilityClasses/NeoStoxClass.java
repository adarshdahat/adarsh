package UtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
}
