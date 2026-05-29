package introSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver",
	                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        
	        driver.findElement(By.id("divpaxinfo")).click();
	        Thread.sleep(2000);
	        
//	        driver.findElement(By.id("hrefIncAdt")).click();
//	        driver.findElement(By.id("hrefIncAdt")).click();
//	        driver.findElement(By.id("hrefIncAdt")).click();
	        
	        int i = 1;
	        while( i < 3 ) {
	            driver.findElement(By.id("hrefIncAdt")).click();
	            i++;
	        }
	        
	        driver.findElement(By.id("btnclosepaxoption")).click();
	        
	        
		

	}

}
