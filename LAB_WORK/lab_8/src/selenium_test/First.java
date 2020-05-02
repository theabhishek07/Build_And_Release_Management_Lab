package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.chrome.ChromeDriver;  
	  
	public class First {  
  
	    public static void main(String[] args) {  
	        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
    driver.navigate().to("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.name("q")).sendKeys("LIC.COM");  
	          
	    // Click on the search button  
	    //driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	      
	    }  
	  
	}