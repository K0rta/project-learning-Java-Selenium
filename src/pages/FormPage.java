package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	public static void submitTheForm (WebDriver driver) {
	    driver.findElement(By.id("first-name")).sendKeys("John");
	    driver.findElement(By.id("last-name")).sendKeys("Monroe");
	    driver.findElement(By.id("job-title")).sendKeys("Test Engineer");
	    driver.findElement(By.id("radio-button-1")).click();
	    driver.findElement(By.id("radio-button-2")).click();
	    driver.findElement(By.id("radio-button-3")).click();
	    driver.findElement(By.id("checkbox-1")).click();
	    driver.findElement(By.id("checkbox-2")).click();
	    driver.findElement(By.id("checkbox-3")).click();
	    driver.findElement(By.id("select-menu")).click();
	    driver.findElement(By.cssSelector("option[value='4']")).click();
	    driver.findElement(By.id("datepicker")).sendKeys("12/12/2012");
	    driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
	    driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary" )).click();
	    }

}
