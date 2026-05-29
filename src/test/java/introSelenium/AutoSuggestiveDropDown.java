package introSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
	                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	        driver.findElement(By.id("autosuggest")).sendKeys("ind");
//	        Thread.sleep(3000);
//	        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//
//	        for(WebElement option : options)
//
//	        {
//
//	        if(option.getText().equalsIgnoreCase("India"))
//
//	        {
//
//	        option.click();
//
//	        break;
//	        } }
	        
	        
	    // checkboxes
	        
//	        Assert.assertFalse(driver.findElement(
//        	        By.cssSelector("input[id*='SeniorCitizenDiscount']")
//        	    ).isSelected());
//	        
//	        System.out.println(
//	        	    driver.findElement(
//	        	        By.cssSelector("input[id*='SeniorCitizenDiscount']")
//	        	    ).isSelected()
//	        	);
//
//	        	driver.findElement(
//	        	    By.cssSelector("input[id*='SeniorCitizenDiscount']")
//	        	).click();
//
//	        	System.out.println(
//	        	    driver.findElement(
//	        	        By.cssSelector("input[id*='SeniorCitizenDiscount']")
//	        	    ).isSelected()
//	        	);
//	        	
//	        	  Assert.assertTrue(driver.findElement(
//	          	        By.cssSelector("input[id*='SeniorCitizenDiscount']")
//	          	    ).isSelected());
//
//	        	// Count checkboxes
//	        	System.out.println(
//	        	    driver.findElements(
//	        	        By.cssSelector("input[type='checkbox']")
//	        	    ).size()
//	        	);
//	        	Assert.assertEquals( driver.findElements(
//	        	        By.cssSelector("input[type='checkbox']")
//	        	    ).size(), 6);
	        	
	        	
	        	
//	        	 enabled disablews radio button
	        	
	        	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

	        	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	        	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	        	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	        	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

	        	{


	        	System.out.println("its enabled");

	        	Assert.assertTrue(true);

	        	}

	        	else

	        	{

	        	Assert.assertTrue(false);

	        	}

	}

}
