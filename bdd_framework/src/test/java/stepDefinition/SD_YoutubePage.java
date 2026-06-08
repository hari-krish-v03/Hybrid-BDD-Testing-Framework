package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.YoutubePage;
import utilities.Param;

public class SD_YoutubePage {

	Param objParam = new Param();

	@When("Navigated to youtube")
	public void NavigateToYouTube() {
		objParam.driver = Hooks.getDriver();
		YoutubePage ytPage = new YoutubePage(objParam);

		ytPage.navigateToYoutube(objParam);
	}

	@Then("Validate youtube logo is displayed")
	public void ValidateLogoIsDisplayed() {
		objParam.driver = Hooks.getDriver();
		YoutubePage ytPage = new YoutubePage(objParam);

		ytPage.logoIsDisplayed(objParam);
	}

	@Then("Search for video")
	public void SearchForVideo() {
		objParam.driver = Hooks.getDriver();
		YoutubePage ytPage = new YoutubePage(objParam);

		ytPage.searchForVideo(objParam);
	}


}
