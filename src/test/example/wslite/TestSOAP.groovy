package test.example.wslite

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.testng.annotations.*
import org.testng.*
import test.TestBase
import wslite.soap.SOAPClient

class TestSOAP {	
	
	static org.apache.log4j.Logger logger = Logger.getLogger(TestSOAP.getClass())
	
	/**Example is taken from groovy-wslite GitHub
	 * https://github.com/jwagenleitner/groovy-wslite
	 * */
	
	@Test
	void SOAPTest() {
		
		logger.debug("SOAP test")
		
		def client = new SOAPClient('http://www.holidaywebservice.com/Holidays/US/Dates/USHolidayDates.asmx')
		def response = client.send(SOAPAction:'http://www.27seconds.com/Holidays/US/Dates/GetMothersDay') {
			body {
				GetMothersDay('xmlns':'http://www.27seconds.com/Holidays/US/Dates/') {
					year(2011)
				}
			}
		}

		assertEquals(response.httpResponse.statusCode,200)
		assertEquals(response.GetMothersDayResponse.GetMothersDayResult.text(),"2011-05-08T00:00:00")
		
	}
	
}
