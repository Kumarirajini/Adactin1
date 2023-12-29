

package com.maven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vkuma\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Kumarirajini");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("27Z6GY");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
Select s1 = new Select(location);
s1.selectByIndex(5);
Thread.sleep(3000);
WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
Select s2 = new Select(hotel);
s2.selectByIndex(2);
WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
Select s3 = new Select(room);
s3.selectByIndex(3);
Thread.sleep(3000);
WebElement roomno = driver.findElement(By.xpath("//select[@id='room_nos']"));
Select s4 = new Select(roomno);
s4.selectByIndex(2);
WebElement Aroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
Select s5 = new Select(Aroom);
s5.selectByIndex(2);
Thread.sleep(3000);
WebElement croom = driver.findElement(By.xpath("//select[@id='child_room']"));
Select s6 = new Select(croom);
s6.selectByIndex(2);
Thread.sleep(3000);

WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
search.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sam");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("John");
Thread.sleep(5000);

driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("N0.5, Rose Street,Chennai-7");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("2346188984567732");
Thread.sleep(2000);
WebElement pay = driver.findElement(By.xpath("//select[@id='cc_type']"));
Select s7 = new Select(pay);
s7.selectByIndex(3);
Thread.sleep(3000);

WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select s8 = new Select(month);
s8.selectByIndex(5);
Thread.sleep(3000);
WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
Select s9 = new Select(year);
s9.selectByIndex(13);
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("275");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='book_now']")).click(); 
Thread.sleep(3000);

TakesScreenshot pic = (TakesScreenshot) driver;
File img = pic.getScreenshotAs(OutputType.FILE);
File snap = new File("C:\\Users\\vkuma\\eclipse-workspace\\Selenium_Concept\\snapshott//ADAC.png");
FileHandler.copy(img, snap);
Thread.sleep(3000);

WebElement s10 = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
s10.click();
Thread.sleep(3000);

TakesScreenshot pic1 = (TakesScreenshot) driver;
File img1 = pic.getScreenshotAs(OutputType.FILE);
File snap1 = new File("C:\\Users\\vkuma\\eclipse-workspace\\Selenium_Concept\\snapshott//Adac1.png");
FileHandler.copy(img1, snap1);
Thread.sleep(3000);

WebElement s11 = driver.findElement(By.xpath("//input[@id='logout']"));
s11.click();
Thread.sleep(2000);

driver.navigate().back();


	}

}



