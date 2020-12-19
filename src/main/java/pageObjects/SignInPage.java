package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public SignInPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement goToLogInButton;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emainInput;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement logInButton;
	
	public WebElement getGoToLogIn()
	{
		return goToLogInButton;
	}
	
	public WebElement getEamailInput()
	{
		return emainInput;
	}
	
	public WebElement getContinueButton()
	{
		return continueButton;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLogIn()
	{
		return logInButton;
	}
	
	
}

