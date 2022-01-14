package seleniummethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/kabbosmac/eclipse-workspace/Facebookscreenshot/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.delta.com/");
		driver.manage().window().maximize();
		
		//showing the date format
//		Date current=new Date();
//		System.out.println(current);
//		String screenshotname=current.toString().replace("", "-").replace(":", "-");
//		System.out.println(screenshotname);
		
		//taking the screenshot of full page
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".//screenshots/homepage.png");
		FileUtils.copyFile(source, target);
	}
	
}

