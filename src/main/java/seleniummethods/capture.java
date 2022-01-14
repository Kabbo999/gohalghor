package seleniummethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capture {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/kabbosmac/eclipse-workspace/Facebookscreenshot/chromedriver");

		WebDriver driver = new ChromeDriver();

	
	
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(".//screenshott/homep.png");
	FileUtils.copyFile(src, trg);
	
	
	driver.close();
	
	}
}
	