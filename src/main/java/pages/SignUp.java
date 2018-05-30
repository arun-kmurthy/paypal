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

public class SignUp extends ProjectMethods{
	
	public SignUp() {
		PageFactory.initElements(driver,this);
	}
	//Web element for Signup button
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleradiopersonal;
	
	//Web element for Signup button
		@FindBy(how=How.LINK_TEXT,using="Next")
		private WebElement eleNext;

	
	public SignUp clickCheckBox() {	
		checkBoxIsSelected(eleradiopersonal);
		return this;
	}
	
	public SeeForYourSelf clickNext() {	
		click(eleNext);
		return new SeeForYourSelf();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
