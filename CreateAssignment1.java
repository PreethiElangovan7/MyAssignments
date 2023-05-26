package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/sarathi/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"+Keys.ENTER);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi"+Keys.ENTER);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elangovan"+Keys.ENTER);
		driver.findElement(By.name("primaryEmail")).sendKeys("preethi123@gmail.com"+Keys.ENTER);
		driver.findElement(By.name("primaryPhoneNumber")).sendKeys("9159995100"+Keys.ENTER);
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		

	}

}
