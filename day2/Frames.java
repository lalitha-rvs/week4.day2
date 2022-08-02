package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("not a friendly Topic");
		driver.switchTo().frame(0);
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		if (checkBox.isSelected()) {
			System.out.println("checkbox is checked");
		}

		else {
			System.out.println("checkbox is not checked");
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement dropDown = driver.findElement(By.xpath("//b[text()='Animals :']"));
		Select dd = new Select(dropDown);
		dd.selectByIndex(2);

	}

}
