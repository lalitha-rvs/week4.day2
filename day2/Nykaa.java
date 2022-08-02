package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		
		
		//1) Go to https://www.nykaa.com/		
	        driver.get("https://www.nykaa.com/	");
	        driver.manage().window().maximize();
	       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        
		//2) Click Brands and Search L'Oreal Paris
	        WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
	        Actions act=new Actions(driver);
	        
			act.moveToElement(findElement).perform();
	        
	        
	     //3) Click L'Oreal Paris
	        
	        driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
	//4) Check the title contains L'Oreal Paris
	        String title=driver.getTitle();
	        if(title.contains("paris")) {
	        	System.out.println("Title contains paris");}
	        	else
	        		{System.out.println("Title doesnot contain paris");
	        }
	      //5) Click sort By and select customer top rated
	        driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'top rated')]")).click();
	//6) Click Category and click Hair->Click haircare->Shampoo
	        driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();
	        driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	       //check box
	        driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
	//7) Click->Concern->Color Protection
	        driver.findElement(By.xpath("//span[text(),'Concern']")).click();
	        driver.findElement(By.xpath("//span[text(),'Color Protection')	")).click();
	//8)check whether the Filter is applied with Shampoo
	        String text = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).getText();
	      if(text.contains("Shampoo"))
	      { System.out.println(" contains Shampoo");}
	      else {
	    	  System.out.println(" doesnot contain Shampoo");}
	      
	    	  
	      
	//9) Click on L'Oreal Paris Colour Protect Shampoo
	driver.findElement(By.xpath("//div[contains(text(),'Colour Protect ')]")).click();
	//10) GO to the new window and select size as 175ml
	       Set<String>winSet = driver.getWindowHandles();
	       List<String>winList=new ArrayList<String>(winSet);
	       //11) Print the MRP of the product
	       String text2 = driver.findElement(By.xpath("//span[text()='MRP:']")).getText();
	       
	       System.out.println(text2);
	       
	   
	      
	        
	        //12) Click on ADD to BAG
	       driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')][1]")).click();
	        
	        //13) Go to Shopping Bag
	     
	        //14) Print the Grand Total amount
	     /*   driver.findElement(null)
	        //15) Click Proceed
	        driver.findElement(null)
	        //16) Click on Continue as Guest
	        driver.findElement(null)
	        //17) Check if this grand total is the same in step 14
	        driver.findElement(null)
	        //18) Close all windows*/
	}}









/*Assignment 3:
============
1) Go to https://www.nykaa.com/
2) Click Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows*/
