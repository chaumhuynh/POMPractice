package pageObjectModel_050118;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_pageClass {

	WebDriver driver;
	
	By usernameField = By.id("txtUsername");
	By passwordField = By.id("txtPassword");	
	By loginButton = By.id("btnLogin");
	
	By Recruitment = By.id("menu_recruitment_viewRecruitmentModule");
	By addButton = By.id("btnAdd");
	
	By firstName = By.id("addCandidate_firstName");
	By lastName = By.id("addCandidate_lastName");
	By Email = By.id("addCandidate_email");
	By Phone = By.id("addCandidate_contactNo");
	By Key = By.id("addCandidate_keyWords");
	By Comment = By.id("addCandidate_comment");
	By Save = By.id("btnSave");
	
	/* create constructor
	 * should have the same name as the class name
	 * constructor does not return value
	 * "this" is a reference to the current object (driver)
	 */
	public POM_pageClass(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void username(String userID) {
		driver.findElement(usernameField).sendKeys(userID);
	}
	
	public void password(String passID) {
		driver.findElement(passwordField).sendKeys(passID);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public void clickRecruitment() {
		driver.findElement(Recruitment).click();
	}
	
	public void clickAdd() {
		driver.findElement(addButton).click();
	}
	
	public void recruitmentInfo(String fName, String lName, String email, String phoneNumber, String keyWord, String comment) {
		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Phone).sendKeys(phoneNumber);
		driver.findElement(Key).sendKeys(keyWord);
		driver.findElement(Comment).sendKeys(comment);
	}
	
	public void clickSave() {
		driver.findElement(Save).click();
	}
}
