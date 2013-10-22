package test.example.selenium

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*
import org.testng.*
import test.TestBase

class TestClass extends TestBase {	
	
	@Test
	void SeleniumTest() {
		
		logger.debug("Selenium test")
		
		def POM = new PageObjectModel(driver)
		driver.get("http://github.com")
		assertTrue(POM.inputSearch.isDisplayed())
		assertTrue(POM.txtLoveGitHub.isDisplayed())
		
	}
	
}
