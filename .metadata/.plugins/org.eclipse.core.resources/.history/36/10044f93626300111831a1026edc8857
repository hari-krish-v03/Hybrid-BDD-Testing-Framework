package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import ReportGenerator.GenerateReports;
import io.cucumber.java.Scenario;
import utilities.DBConnection;

public class Hooks {

	static WebDriver driver = null;
	static String browser;
	public static String scenarioName;


	//Setup Broswer
	@Before(order=2)
	public void browserSetup(Scenario scenario) {
		//	Select browser	
		try {
			if(browser.equals("Chrome")) {
				driver = new ChromeDriver();
			}
			else if(browser.equals("Edge")) {
				driver = new EdgeDriver();
			}

			scenarioName = scenario.getName();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
		catch(Exception e) {
			System.out.println("Unable to open browser");
			e.printStackTrace();
		}

	}

	@Before(order=1)
	public void openDBConnection(Scenario scenario) {
		String scenarioName = scenario.getName();
		//Open DB connection
		DBConnection.loadDB(scenarioName);
		browser = utilities.DBConnection.retriveDataDB("browser");
	}

	@After
	public void closeBrowser() {
		driver.quit();
		DBConnection.closeConnection();
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
