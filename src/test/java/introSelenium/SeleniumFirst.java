package introSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
	                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.redbus.in");
	        System.out.print(driver.getTitle());

	}

}
