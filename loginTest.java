import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {

	//user define function
	@Test
	public void verifyAdminLoginSucessful() {
		
		// TODO Auto-generated method stub C:\selenium\chromedriver_win32
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("http://127.0.0.1/orangehrm-3.3.1/");//launch  chrome with url
		chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.id("txtPassword")).sendKeys("admin");
		chrome.findElement(By.id("btnLogin")).click();

	}
	

}
