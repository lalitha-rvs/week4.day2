package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button [onclick='normalAlert()']")).click();
		// <button onclick="normalAlert()">Alert Box</button>
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		System.out.println(driver.getTitle());
		// alert.sendKeys("this is alert exception");
		Thread.sleep(2000);

		driver.findElement(By.xpath("button [onclick='confirmAlert()']")).click();
		// <button onclick="confirmAlert()">Confirm Box</button>
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		alert1.dismiss();
		System.out.println(driver.getTitle());
		// alert.sendKeys("this is exception for alert");
		Thread.sleep(2000);

	}
}
