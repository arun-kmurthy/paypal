package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PayPalLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
driver.get("https://www.paypal.com/in/home");
driver.findElementById("signup-button").click();
	boolean selected = driver.findElementById("radio-personal").isSelected();
	if (!selected) {
		driver.findElementById("radio-personal").click();
	}
	driver.findElementByLinkText("Next").click();
	WebElement country = driver.findElementById("country");
Select dd=new Select(country);
dd.selectByVisibleText("India");
driver.findElementById("email").sendKeys("arun@gmail.com");
driver.findElementById("password").sendKeys("aspire@123"); 
driver.findElementById("confirmPassword").sendKeys("aspire@123");
driver.findElementById("_eventId_personal").click();
	}

}
