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

public class SeeForYourSelf extends ProjectMethods{

	public SeeForYourSelf() {
		PageFactory.initElements(driver,this);
	}
	//Web element for Country DropDown
	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;

	//Web element for Email text box
	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;

	//Web element for Password text box
	@FindBy(how=How.ID,using="password")
	private WebElement elepassword;

	//Web element for reenter Password text box
		@FindBy(how=How.ID,using="confirmPassword")
		private WebElement eleconfirmPassword;
		
		//Web element for continue button
				@FindBy(how=How.ID,using="_eventId_personal")
				private WebElement eleeventIdpersonal;
	
	
	//select country
	public SeeForYourSelf selectCountry(String data) {	
		selectDropDownUsingText(eleCountry, data);
		return this;
	}
	//enter password
	public SeeForYourSelf enterpassword(String data) {	
		type(elepassword, data);
		return this;
	}
	
	//re-enter Password
		public SeeForYourSelf enterReenterPassword(String data) {	
			type(eleconfirmPassword, data);
			return this;
		}

//enter email
	public SeeForYourSelf enterEmail(String data) {	
		type(eleEmail, data);
		return this;
	}
	
	//Click Continue
		public SecurityPage clickContinue() {	
			click(eleeventIdpersonal);
			return new SecurityPage();
		}	
	
	
	



















}
