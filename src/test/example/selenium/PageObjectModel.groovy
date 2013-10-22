package test.example.selenium

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class PageObjectModel {

	private WebDriver driver
	
	@FindBy (id = "js-command-bar-field")
	public WebElement inputSearch
	
	@FindBy (xpath = "//h1[text()='Why you’ll love GitHub.']")
	public WebElement txtLoveGitHub
	
	public PageObjectModel(WebDriver driver){
		
		PageFactory.initElements(driver, this)
		this.driver = driver
		
	}

}
