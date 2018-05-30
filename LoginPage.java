package pages;
/*Username textfield returning this
Password field returning this
Login button returning Home Page
login button for failure return this */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Web element for UserName text field using ID
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	
	//Web element for error message using ID
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	//Web Element for Password using ID
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	//Web Element for Login button
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	public LoginPage enterUserName(String data) {
		type(eleUserName, data);
		return this;
	}
	
		
	public LoginPage enterPassword(String data) {
		type(elePassword, data);
		return this;
	}
	
	
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage();		
	}
	
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
		
	public LoginPage verifyErrorMsg(String data) {
	verifyPartialText(eleErrorMsg, data);
		return this;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
