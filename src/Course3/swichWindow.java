package Course3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class swichWindow {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        WebElement newTab = driver.findElement(By.id("new-tab-button"));
        newTab.click();
        String originalHandle = driver.getWindowHandle();
        
        for (String hendel1: driver.getWindowHandles()) {
        	driver.switchTo().window(hendel1);
        }
        Thread.sleep(3000);
        driver.switchTo().window(originalHandle);
      
        driver.quit();
    }
}


