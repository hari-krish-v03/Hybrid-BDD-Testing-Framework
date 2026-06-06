package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import ReportGenerator.GenerateReports;
import io.cucumber.java.Scenario;

public class Hooks {

	static WebDriver driver = null;
	static String browser = "Chrome";
	public static String scenarioName;


	@Before
	public void browserSetup(Scenario scenario) {
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		scenarioName = scenario.getName();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@After
	public void closeBrowser() {
		//		driver.close();
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	//	@After
	//	public void genReport(Scenario scenario) {
	//		
	//		GenerateReports.generateReport(scenario.getName());
	//	}

}
