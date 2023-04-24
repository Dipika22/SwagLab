package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
public static ExtentReports CreateReports () {
		
		ExtentSparkReporter htmlReports = new ExtentSparkReporter("SwagLab.html");
		ExtentReports extentReports = new ExtentReports(); 
		extentReports.attachReporter(htmlReports);
		extentReports.setSystemInfo("Tested by", "Dipika");
		extentReports.setSystemInfo("Test type", "Regression Testing");
		return extentReports;
				
		
	}

}
