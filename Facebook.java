package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Step 2: Launch the chromebrowser
		System.setProperty("webdriver.chrome.driver", "/home/sarathi/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	   
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/following::a[text()='Create new account']")).click();
		//driver.findElement(By.xpath("//*[@id=\"u_0_0_Hs\"]")).click();
		//driver.findElement(By.xpath("//form[@class='_9vtf']//a[2]")).click();
		
		// Step 7: Enter the first name
		//driver.findElement(By.xpath("//div[@class='_5dbb']//input")).sendKeys("preethi");
		//driver.findElement(By.xpath("//input[@label='First name']")).sendKeys("preethi");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("preethi");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input[@name='lastname']")).sendKeys("elangovan");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input[@name='reg_email__']")).sendKeys("9159995100");
		
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Ammu@7");
		
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByIndex(6);
		
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("1995");
		
		// Step 12: Select the radio button "Female" 
		           // ( A normal click will do for this step) 
		//WebElement Female = driver.findElement(By.xpath("//label[text()='female']"));
		driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[text()='Female']")).click();

	}

}
