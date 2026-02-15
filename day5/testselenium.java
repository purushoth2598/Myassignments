package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class testselenium {
	public static void main(String[] args) {
     
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Purushoth");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
	driver.close();
	}

}
