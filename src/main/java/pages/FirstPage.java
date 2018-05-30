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

public class FirstPage extends ProjectMethods{
	
	public FirstPage() {
		PageFactory.initElements(driver,this);
	}
	//Web element for Signup button
	@FindBy(how=How.ID,using="signup-button")
	private WebElement elesignupButton;
	

	
	public SignUp clickSignUp() {	
		click(elesignupButton);
		return new SignUp();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
