package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DearlerPageObject extends Base{

	public DearlerPageObject() {
		
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath = "//h1[contains(text(),'Authentication')]")
	private WebElement Authentication;
	
	public void clickSignIn() {
		signIn.click();
	}
	public boolean isEmailPresent() {
		if(Email.isDisplayed())
		return true;
		else
			return false;
	}
	
	public boolean isAuthenticationDisplayed() {
		if (Authentication.isDisplayed())
			return true;
		else
			return false;
	}
}

