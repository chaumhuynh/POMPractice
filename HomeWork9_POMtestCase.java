package pageObjectModel_050118;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork9_POMtestCase {
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chau\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
			
		HomeWork9_POMpageClass login = new HomeWork9_POMpageClass(driver);
		
		//call method from pageClass
		
		login.OrangeHRMLogin("Admin", "admin");
		login.AddEmployee("Chau", "Huynh");
	}
}
