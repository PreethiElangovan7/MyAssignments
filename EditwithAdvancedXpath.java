package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditwithAdvancedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/sarathi/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click Login
		driver.findElement(By.xpath("//*[@id=\"login\"]/p[3]/input")).click();
		
		//Click crm/sfa link
		driver.findElement(By.xpath("//div[@class='crmsfa']/a")).click();
		
		//Click Leads link
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
				
		//Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
        //Enter company name
		//driver.findElement(By.xpath("//td[@id='ext-gen590']/input")).sendKeys("Google");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Google");
		
        //Enter first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[@name='firstName']")).sendKeys("bharathi");
		
        //Enter last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[@name='lastName']")).sendKeys("krishnan");
		
        //click on Create Lead button 
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click Edit
		driver.findElement(By.xpath("//a[text()='Qualify Lead']/following-sibling::a[text()='Edit']")).click();
		
		//13 Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Microsoft");
		
		//Click Update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}
