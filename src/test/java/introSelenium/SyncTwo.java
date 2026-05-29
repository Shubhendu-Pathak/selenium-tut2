package introSelenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int j = 0;
		
		 System.setProperty("webdriver.chrome.driver",
	                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		explicit wait
		WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds (5));
//		explicit wait
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));
		

	
		
		for(int i = 0; i < products.size(); i++) {
			
			String[] name=products.get(i).getText().split("-");
			String formattedName = name[0].trim();
//			System.out.println(formattedName);
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//				j++;
//				
//				if(j == itemsNeededList.size()) {
//				break;
//				}
			}
			
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
//		explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated (By.cssSelector("input.promoCode")));
//		explicit wait
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
//		explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//		explicit wait
		
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

	}

}
