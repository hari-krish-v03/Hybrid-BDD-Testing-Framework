package webActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Param;

public class WebGeneralActions {

	//This method clicks on the element
	public void clickElement(Param objParam, WebElement element, String comment) {
		try {
			//			WebDriver driver = objParam.driver;
			element.click();
			objParam.reportEvents.eventCompleted("PASS", comment);
		}
		catch(Exception e) {
			objParam.reportEvents.eventCompleted("FAIL", comment);
		}
	}

	public void navigateToPage(Param objParam ,String url, String comment) {
		try {
			WebDriver driver = objParam.driver;
			driver.navigate().to(url);
			objParam.reportEvents.eventCompleted("PASS", comment);
		}
		catch(Exception e) {
			objParam.reportEvents.eventCompleted("FAIL", comment);
		}
	}
}
