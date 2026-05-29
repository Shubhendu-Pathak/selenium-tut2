package introSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSort2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\chrome_downloads\\chromedriver-folder\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

        List<String> price;

        do {

            // capture fresh elements every time page changes
            List<WebElement> elementsList =
                    driver.findElements(By.xpath("//tr/td[1]"));

            // filter vegetable and get price
            price = elementsList.stream()
                    .filter(s -> s.getText().contains("Carrot"))
                    .map(WebSort2::getPriceVeggie)
                    .collect(Collectors.toList());

            // if not found click next
            if (price.size() < 1) {

                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }

        } while (price.size() < 1);

        // print found price
        price.forEach(System.out::println);

        driver.quit();
    }

    // method to get price from sibling column
    private static String getPriceVeggie(WebElement s) {

        return s.findElement(By.xpath("following-sibling::td[1]")).getText();
    }
}