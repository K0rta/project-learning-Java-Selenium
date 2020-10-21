package Course3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class switchToAlert {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        
        Alert alert = driver.switchTo().alert();
        
        String alertText = "This is a test alert!";
        String zipCode = alert.getText();
        Assert.assertEquals(alertText, zipCode);
        System.out.println(alertText + " == "+ zipCode);
        
        alert.accept();
      
        driver.quit();
    }
}


