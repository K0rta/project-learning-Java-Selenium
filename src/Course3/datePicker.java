package Course3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class datePicker {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        
        WebElement datefield = driver.findElement(By.id("datepicker"));
        datefield.sendKeys("03/03/2020");
        datefield.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        WebElement datapicker = driver.findElement(By.cssSelector("div.container"));
        datapicker.click();
        datefield.click();
        WebElement date = driver.findElement(By.cssSelector("td[data-date='1583712000000']"));
        date.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
