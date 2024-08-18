package hooks;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class MyHooks {

	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		
		Properties prop = ConfigReader.intializeProperties();
		driver = DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
		/*
		 * driver = DriverFactory.initializeBrowser("chrome");
		 * driver = new ChromeDriver(); driver.manage().deleteAllCookies();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("http://tutorialsninja.com/demo");
		 */
		
		/*
		 * Properties prop = ConfigReader.intializeProperties();
		 * DriverFactory.initializeBrowser(prop.getProperty("browser")); driver =
		 * DriverFactory.getDriver(); driver.get(prop.getProperty("url"));
		 */
		/*
		 * driver.manage().deleteAllCookies(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get(prop.getProperty("url"));
		 */

	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "imp/png", scenarioName);
		
		}
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
}
