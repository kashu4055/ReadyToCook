package test.example.wslite

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.testng.annotations.*
import org.testng.*
import test.TestBase
import wslite.rest.RESTClient

class TestREST {
	
	static org.apache.log4j.Logger logger = Logger.getLogger(TestREST.getClass())
	
	@Test
	void RESTTest() {
		
		logger.debug("REST test")
		
		def client = new RESTClient("http://jsonip.com/?")
		def response = client.get()

		assertEquals(response.statusCode,200)
		assertEquals(response.json.about,"/about")
		
	}

}
