import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PMI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			WebDriver chrome=new ChromeDriver();
			
			chrome.get("http://127.0.0.1/orangehrm-3.3.1/");//launch  chrome with url
			chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
			chrome.findElement(By.id("txtPassword")).sendKeys("admin");
			chrome.findElement(By.id("btnLogin")).click();
			
			
			
			chrome.findElement(By.id("menu_pim_viewPimModule")).click();
			
			chrome.findElement(By.id("btnAdd")).click();
			Thread.sleep(5000);
			
			chrome.findElement(By.id("firstName")).sendKeys("ashvini2");
			chrome.findElement(By.id("middleName")).sendKeys("ASHVINI1");
			chrome.findElement(By.id("lastName")).sendKeys("ASHVINI2");
			
			chrome.findElement(By.id("btnSave")).click();

	}

}
