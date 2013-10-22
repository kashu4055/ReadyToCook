package test

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import org.testng.annotations.*
import org.testng.*
import wslite.rest.RESTClient

class TestBase {
	
	static org.apache.log4j.Logger logger = Logger.getLogger(TestBase.getClass())
	static WebDriver driver
	
	private Properties Config = new Properties()
	
	@BeforeClass
	void SetUp() {
		
		logger.debug("TestBase SetUp")

		InputStream istream = TestBase.class.getClassLoader().getResourceAsStream("selenium.properties")
		Config.load(istream)
		GetDriver(Config.getProperty("driver"))
		
	}
	
	@AfterClass
	void TearDown(){
	
		logger.debug("TestBase TearDown")
		
		driver.quit()

	}
	
	private void GetDriver(String name){
		switch(name){
			case "Firefox":
				WebDriver dr = new FirefoxDriver()
				driver = new EventFiringWebDriver(dr)
				driver.manage().window().maximize()
				break
			case "IE":
				WebDriver dr = new InternetExplorerDriver()
				driver = new EventFiringWebDriver(dr)
				driver.manage().window().maximize()
				break
			case "Chrome":
				WebDriver dr = new ChromeDriver()
				driver = new EventFiringWebDriver(dr)
				driver.manage().window().maximize()
				break
		}
	}

}
