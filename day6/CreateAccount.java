package day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("testdata");
		driver.findElement(By.name("description")).sendKeys("Creating the test data");
		WebElement source = driver.findElement(By.name("industryEnumId"));
	    Select sourcedrop = new Select(source);
	    sourcedrop.selectByIndex(3);
	    WebElement source1 =driver.findElement(By.name("ownershipEnumId"));
	    Select sourcedrop1 = new Select(source1);
	    sourcedrop1.selectByVisibleText("S-Corporation ");
	    WebElement source3 =driver.findElement(By.id("dataSourceId"));
	    Select sourcedrop4 = new Select(source3);
	    sourcedrop4.selectByValue("LEAD_EMPLOYEE");
	    WebElement source4 =driver.findElement(By.id("marketingCampaignId"));
	    Select sourcedrop6 = new Select(source4);
	    sourcedrop6.selectByIndex(6);
	    WebElement source5 =driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select sourcedrop5 = new Select(source5);
	    sourcedrop5.selectByValue("TX");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.close();
	    
	  


	    

	    
	    

	}

}
