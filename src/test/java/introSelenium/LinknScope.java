package introSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinknScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver",
			      "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");
				  WebDriver driver = new ChromeDriver();
				  driver.get("http://www.ebay.com/");  
				  
				//Count of the Link in the Entire Page
//				System.out.println("Links in the Page");
//				System.out.println(driver.findElements(By.tagName("a")).size());
//				
//				//Count of links in the footer section of the page
//			    WebElement footer = driver.findElement(By.xpath(".//*[@id='dp-global-footer']"));
//				System.out.println("Links in the footer section");
//				System.out.println(footer.findElements(By.tagName("a")).size());
//				
//				//Count of links in the footer section of the page in second column
//				WebElement col=driver.findElement(By.xpath("(//*[@class='gf-big-links__col']/div/ul)[2]"));
//				System.out.println("Links in the 2nd coloumn of the section");
//				System.out.println(col.findElements(By.tagName("a")).size());
//							
				// click on each link in the coloumn and check if the pages are opening-
				
//				WebElement col1 =driver.findElement(By.xpath("(//*[@class='gf-big-links__col']/div/ul)[1]"));
//				for(int i=1;i<col1.findElements(By.tagName("a")).size(); i++)
//				{
//				String clickonlinkTab= Keys.chord(Keys.CONTROL, Keys.ENTER);
//				col1.findElements (By.tagName("a")).get(i).sendKeys(clickonlinkTab);
//				}
				
				
// 				click on each link in the coloumn and check if the pages are opening- and print title of each tab
				
				
				WebElement col1 =driver.findElement(By.xpath("(//*[@class='gf-big-links__col']/div/ul)[1]"));
				
				// tab opens  = this code is correct 
//				for(int i=1;i<col1.findElements(By.tagName("a")).size(); i++)
//				{
//					
//					
//				String clickonlinkTab= Keys.chord(Keys.CONTROL, Keys.SHIFT, Keys.RETURN);
//				col1.findElements (By.tagName("a")).get(i).sendKeys(clickonlinkTab);
//				 Thread.sleep(1000); // IMPORTANT to avoid crash
//				 
//				} 
				
				// tab opens  = this code is correct  too but provides limiting of tabs to open so that chrome does not crashes
				for(int i=1;i < 4; i++)
				{
					
					
				String clickonlinkTab= Keys.chord(Keys.CONTROL, Keys.SHIFT, Keys.RETURN);
				col1.findElements (By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				 Thread.sleep(1000); // IMPORTANT to avoid crash
				 
				} 
				
				Thread.sleep(5000);
				
				Set<String> abc = driver.getWindowHandles();
				Iterator<String> it = abc.iterator();
				
				// extracts title
				while(it.hasNext()) {
					
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
					
				}
				
				
				
				}
				
				
				
	}


