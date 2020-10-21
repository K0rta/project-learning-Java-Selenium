package Course3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        
        WebElement fileField = driver.findElement(By.id("file-upload-field"));
        fileField.sendKeys("E:\\_Tanya\\Learning_JAVA\\workspace\\LinkedinSelenium\\bin\\Course3\\file-to-upload.png");
        Thread.sleep(3000);
       
        driver.quit();
    }
}
