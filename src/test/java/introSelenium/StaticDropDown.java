package introSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
	                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        
	        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	        Select dropdown = new Select(staticDropdown);
	        dropdown.selectByIndex(3);
	        System.out.println( dropdown.getFirstSelectedOption().getText() );
	        dropdown.selectByVisibleText("AED");
	        System.out.println( dropdown.getFirstSelectedOption().getText() );
	        dropdown.selectByValue("INR");
	        System.out.println( dropdown.getFirstSelectedOption().getText() );
	        
		

	}

}
