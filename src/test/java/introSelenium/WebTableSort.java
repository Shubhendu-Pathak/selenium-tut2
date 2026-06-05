package introSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import introSelenium3.introSelenium3.WebSortStream;

public class WebTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver",
	                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
	        
//	         click on column
//	        driver.findElement(By.xpath("//tr/th[1]")).click();
	        
//	         capture all element in first column
	        
	        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
	        System.out.println(elementsList);
	        
//	         capture text 
	        
	        List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
//	        System.out.println(originalList);
	        
	        // sort the list
	        
	        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
//	        System.out.println(sortedList);
	        
//	         print price of list
	        
	        List<String> price;

	        do {
	            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

	            price = rows.stream()
	                    .filter(row -> row.getText().contains("Almond"))
	                    .map(WebTableSort::getPrice)
	                    .collect(Collectors.toList());

	            if (price.size() < 1) {
	                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
	            }

	        } while (price.size() < 1);

	        Assert.assertTrue(price.size() > 0);
//	        System.out.println("Price of Almond = " + price.get(0));
	        System.out.println(price);
	        
		
	}
	
	private static String getPrice(WebElement s) {
		String val =  s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return val;
	}
}
	     
	
	
