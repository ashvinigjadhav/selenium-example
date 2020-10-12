package com.demojava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dhyanyog.common.WebDriverFactory;

public class Seleniumclass {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.out.println("selenium project 1");
      
      
   //  set property PropertyPermission(key, "value exe file path ") // Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver(); //Creating an object of ChromeDriverdr=new ChromeDriver() of interface selenium. WebDriver;
		WebDriverWait wait=new 	WebDriverWait(WebDriverFactory.getDriver(),50);
		dr.get("http://127.0.0.1/orangehrm-3.3.1/"); 
		wait.until(ExpectedConditions.alertIsPresent());
	    dr.manage().window().maximize();
	    System.out.println("class="+dr.manage().window().getClass());
	    System.out.println("pagesource="+dr.getPageSource());
	    
	    System.out.println("pagetitle="+dr.getTitle());
	    System.out.println("windowHandle="+dr.getWindowHandle());
	    System.out.println("hashcode="+dr.hashCode());
	    
	         // dr.wait(50);
	          System.out.println("logs="+ dr.manage().logs());
	          
	    dr.manage().deleteAllCookies();
	    dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    //implicit wait
	    dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //end
	    dr.quit();





	}
}

