package day6;
//import java.time.Duration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("RAHUL");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("9788060146");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Velu@2244");
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		WebElement dropsource =driver.findElement(By.id("day"));
		Select source = new Select(dropsource);
		source.selectByValue("5");
		WebElement dropsource1 =driver.findElement(By.id("month"));
		Select source1 = new Select(dropsource1);
		source1.selectByValue("5");
		WebElement dropsource4 =driver.findElement(By.id("year"));
		Select source4 = new Select(dropsource4);
		source4.selectByValue("1950");
		
	
		driver.findElement(By.name("websubmit")).click();

				
		
		
		

	}

}
