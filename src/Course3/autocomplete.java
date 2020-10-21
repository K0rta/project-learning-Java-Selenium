package Course3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autocomplete {
    public static void main(String[] args){
    	String code = "07023";
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomp = driver.findElement(By.id("autocomplete"));
        autocomp.click();
        autocomp.sendKeys("141 South Avenue, Fanwood, NJ, USA");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteResult =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        //WebElement autocompResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement zip = driver.findElement(By.id("postal_code"));
        String zipCode = zip.getAttribute("value");
        Assert.assertEquals(code, zipCode);
        System.out.println(code + " == "+ zipCode);
        
        driver.quit();
    }
}


