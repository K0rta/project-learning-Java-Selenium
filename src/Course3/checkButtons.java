package Course3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkButtons {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        
        WebElement checkbutton1 = driver.findElement(By.id("checkbox-1"));
        checkbutton1.click();
        Thread.sleep(3000);
        checkbutton1.click();
        WebElement checkbutton2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbutton2.click();
        Thread.sleep(3000);
        checkbutton2.click();
        WebElement checkbutton3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
        checkbutton3.click();
        Thread.sleep(3000);
        checkbutton3.click();
        driver.quit();
    }
}
