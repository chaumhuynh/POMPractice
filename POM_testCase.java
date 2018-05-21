package pageObjectModel_050118;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_testCase {

	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chau\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");

		// create a new instance of page class
		POM_pageClass loginEx = new POM_pageClass(driver);

		// call methods to perform operation (from page class)
		loginEx.username("Admin");
		loginEx.password("admin");
		loginEx.clickLogin();
		
		loginEx.clickRecruitment();
		
		loginEx.clickAdd();

		loginEx.recruitmentInfo("Chau", "Huynh", "testing@yahoo.com", "571-499-9000", "testing", "Page Object Model");
		
		loginEx.clickSave();
	}
}
