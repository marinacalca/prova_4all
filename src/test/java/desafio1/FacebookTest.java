package desafio1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.WebDriverFactory;

public class FacebookTest {
	
	@Test
	public void shouldNotLoginWithIncorrectCreds() {
		 WebDriver driver = WebDriverFactory.getWebDriver("org.openqa.selenium.firefox.FirefoxDriver");
		// WebDriver driver = WebDriverFactory.getWebDriver("org.openqa.selenium.edge.EdgeDriver");
		//WebDriver driver = WebDriverFactory.getWebDriver("org.openqa.selenium.chrome.ChromeDriver");

	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.enterUserLogin("marina.calca@gmail.com");
	    loginPage.enterUserPassword("nino181089");
	    HomePage homePage = loginPage.submitLoginCredentials();
	    assert (!homePage.checkIfLoginSucceed());
	}

}
