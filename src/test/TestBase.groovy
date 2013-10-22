package test

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.testng.annotations.*
import org.testng.*
import wslite.rest.RESTClient

class TestBase {
	
	static org.apache.log4j.Logger logger = Logger.getLogger(TestBase.getClass())
	
	@BeforeClass
	void SetUp() {
		
		logger.debug("TestBase SetUp")
		
	}
	
	
	@AfterClass
	void TearDown(){
	
		logger.debug("TestBase TearDown")
			
	}

}
