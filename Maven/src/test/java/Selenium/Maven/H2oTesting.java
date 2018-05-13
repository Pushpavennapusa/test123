package Selenium.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2oTesting {

	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("http://www.h2otestingtools.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Training")).click();
	driver.findElement(By.xpath("/html/body/app-root/div[3]/app-training/div/p-datatable/div/div[2]/table/tbody/tr[2]/td[8]/span[2]/div/a")).click();
	WebElement element= driver.findElement(By.className("socialMediaFb"));
	element.click();
	driver.quit();
	
	
	

	}

}
