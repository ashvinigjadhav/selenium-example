import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddUser {
	@Test
	public void AdduserESSEnable() throws InterruptedException {
		Thread.sleep(10000);
		// TODO Auto-generated method stub
		System.out.println("case 1 start");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("http://127.0.0.1/orangehrm-3.3.1/");//launch  chrome with url
		chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.id("txtPassword")).sendKeys("admin");
		chrome.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(10000);
		
		chrome.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(10000);
		//System.out.println(btnSave.getText());
		WebElement btnAdd=chrome.findElement(By.id("btnAdd"));
		System.out.println(btnAdd.getText());
		btnAdd.click();
		
		
		//case 1
		System.out.println("case 1");
		
		WebElement usertypeE1 =chrome.findElement(By.id("systemUser_userType"));
		Select roleUserE1=new Select(usertypeE1);
		
		roleUserE1.selectByVisibleText("ESS");
		chrome.findElement(By.id("systemUser_employeeName_empName")).sendKeys("EASHVINI1");
		WebElement userStatusE1 =chrome.findElement(By.id("systemUser_status"));
		Select roleUserstatusE1=new Select(userStatusE1);
		roleUserstatusE1.selectByValue("1");
		
		chrome.findElement(By.id("systemUser_userName")).sendKeys("ASHVINI1");
		chrome.findElement(By.id("systemUser_password")).sendKeys("ASHVINI123");
		chrome.findElement(By.id("systemUser_confirmPassword")).sendKeys("ASHVINI123");
		chrome.findElement(By.id("btnSave")).click();
		System.out.println("case 1 pass");
		chrome.quit();
	}
	@Test
	public void AdduserESSDisable() throws InterruptedException {
		//case 2
		System.out.println("case 2 start");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("http://127.0.0.1/orangehrm-3.3.1/");//launch  chrome with url
		chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.id("txtPassword")).sendKeys("admin");
		chrome.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(10000);
		chrome.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(15000);
		chrome.findElement(By.id("btnAdd")).click();
			
		WebElement usertypeE0 =chrome.findElement(By.id("systemUser_userType"));
		Select roleUserE0=new Select(usertypeE0);
		
				roleUserE0.selectByVisibleText("ESS");
		
		WebElement userStatusE0 =chrome.findElement(By.id("systemUser_status"));
		Select roleUserstatusE0=new Select(userStatusE0);
		roleUserstatusE0.selectByValue("0");
		
		chrome.findElement(By.id("systemUser_employeeName_empName")).sendKeys("eASHVINI1");
		chrome.findElement(By.id("systemUser_userName")).sendKeys("ASHVINI1");
		chrome.findElement(By.id("systemUser_password")).sendKeys("ASHVINI123");
		chrome.findElement(By.id("systemUser_confirmPassword")).sendKeys("ASHVINI123");
		chrome.findElement(By.id("btnSave")).click();
		System.out.println("case 2 pass");
		chrome.quit();
	}
		
	@Test
		public void AdduserAdminDisable() throws InterruptedException {
			
			System.out.println("case 3 start");
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			WebDriver chrome=new ChromeDriver();
			
			chrome.get("http://127.0.0.1/orangehrm-3.3.1/");//launch  chrome with url
			chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
			chrome.findElement(By.id("txtPassword")).sendKeys("admin");
			chrome.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(10000);
	//case 3	
		System.out.println("case 3");
		chrome.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(10000);
		chrome.findElement(By.id("btnAdd")).click();
		
        //chrome.findElement(By.id("btnAdd")).click(); 
		
		WebElement usertypeA0 =chrome.findElement(By.id("systemUser_userType"));
		Select roleUserA0=new Select(usertypeA0);
				
		roleUserA0.selectByVisibleText("Admin");
		
		WebElement userStatusA0 =chrome.findElement(By.id("systemUser_status"));
		Select roleUserstatusA0=new Select(userStatusA0);
		roleUserstatusA0.selectByValue("0");
		chrome.findElement(By.id("systemUser_employeeName_empName")).sendKeys("AASHVINI0");
		chrome.findElement(By.id("systemUser_userName")).sendKeys("ASHVINI1");
		chrome.findElement(By.id("systemUser_password")).sendKeys("ASHVINI123");
		chrome.findElement(By.id("systemUser_confirmPassword")).sendKeys("ASHVINI123");
		chrome.findElement(By.id("btnSave")).click();
		System.out.println("case 3 pass");
		chrome.quit();

		}
		
	@Test
		public void AdduserAdiminenable() throws InterruptedException {
			//case 4
			System.out.println("case 4 start");
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			WebDriver chrome=new ChromeDriver();
			
			chrome.get("http://127.0.0.1/orangehrm-3.3.1/");//launch  chrome with url
			chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
			chrome.findElement(By.id("txtPassword")).sendKeys("admin");
			chrome.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(10000);
		
		System.out.println("case 4 ");
		chrome.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(10000);
		chrome.findElement(By.id("btnAdd")).click();
		WebElement usertypeA1 =chrome.findElement(By.id("systemUser_userType"));
		Select roleUserA1=new Select(usertypeA1);
		roleUserA1.selectByVisibleText("Admin");
		WebElement userStatusA1 =chrome.findElement(By.id("systemUser_status"));
		Select roleUserstatusA1=new Select(userStatusA1);
		roleUserstatusA1.selectByValue("1");
			chrome.findElement(By.id("systemUser_employeeName_empName")).sendKeys("AASHVINI1");
			chrome.findElement(By.id("systemUser_userName")).sendKeys("ASHVINI1");
			chrome.findElement(By.id("systemUser_password")).sendKeys("ASHVINI123");
			chrome.findElement(By.id("systemUser_confirmPassword")).sendKeys("ASHVINI123");
			chrome.findElement(By.id("btnSave")).click();
			
			System.out.println("case 4 pass");
			
	}

}
