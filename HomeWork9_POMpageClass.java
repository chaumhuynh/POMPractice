package pageObjectModel_050118;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeWork9_POMpageClass {

	WebDriver driver;
	
	//Step 1: using By
	By userID = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	By PIM = By.id("menu_pim_viewPimModule");
	By addButton = By.id("btnAdd");
	
	By fName = By.id("firstName");
	By lName = By.id("lastName");
	
	By saveButton = By.id("btnSave");
	
	//Step 2: constructor
	public HomeWork9_POMpageClass (WebDriver driver) {
		this.driver = driver;
	}
	
	//Step 3: create method
	public void OrangeHRMLogin(String uID, String pw) {
		driver.findElement(userID).sendKeys(uID);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(login).click();
	}
	
	public void AddEmployee(String firstname, String lastname) {
		driver.findElement(PIM).click();
		driver.findElement(addButton).click();
		driver.findElement(fName).sendKeys(firstname);
		driver.findElement(lName).sendKeys(lastname);
		driver.findElement(saveButton).click();
	}
}
