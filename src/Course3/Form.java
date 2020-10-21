package Course3;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ConfirmationPage;
import pages.FormPage;

public class Form {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32 v 86\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        
        FormPage.submitTheForm(driver);
       
       ConfirmationPage.waitForTheAlertBanner(driver);
       
       String alertText = "The form was successfully submitted!";
       assertEquals(alertText, ConfirmationPage.getAlertBannerText(driver));
        
        driver.quit();
    }
    
      
}
