package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

public static void takingScreenshot (WebDriver driver, String name ) throws IOException {
		
		DateAndTime.DateTime();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("E:\\Automation\\Naaptol\\Screenshot\\"+name+" - "+DateAndTime.DateTime()+".png");
		FileHandler.copy(source, destination);
		
		
		
	}
}
