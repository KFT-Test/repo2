package learningmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MavenfirstClass {
	
	WebDriver driver;
	
	@BeforeSuite
	public void init() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium course\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}
	
    @Test
	public void OpenUrl(){
	String text;
    driver.get("http://cookbook.seleniumacademy.com/Locators.html");
    
    
    }

}
