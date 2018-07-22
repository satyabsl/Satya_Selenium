package com.k2js.handson.stretchtask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravels {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..\\Browserexes\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("http://www.phptravels.net");
		//Click the MYACCOUNT
				cd.findElementByXPath("(//a[starts-with(@class, 'dropdown')])[3]").click();
				cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementByXPath("(//a[(@class='go-text-right')])[13]").click();
				//Click the Login
				cd.findElementByXPath("(//ul[@class='dropdown-menu']//a)[3]").click();
				//Enter the Username
				cd.findElementByName("username").sendKeys("satyartr@in.ibm.com");
				//Enter the password
				cd.findElementByName("password").sendKeys("national");
				//Enter the Logon button
				//cd.findElementById("loginfrm").click();
				cd.findElementByXPath(".//*[@id='loginfrm']/div[1]/div[5]/button").click();
				Thread.sleep(3000);
				//Click Hotel Tab
				cd.findElementByXPath("(.//*[@id='offcanvas-menu']/ul/li[1]/a/span[1]/img").click();
				//Click Filter button
				cd.findElementByXPath("(//i[starts-with(@class, 'icon-filter')])[2]").click();
				Thread.sleep(3000);
				//Select the 3 Star Hotel
				cd.findElementByXPath("(//ins[@class='iCheck-helper'])[3]").click();
				//Click Search Button
				cd.findElementById("searchform").click();
				//Select the Hotel
				cd.findElementByXPath("(//div[starts-with(@class, 'col-md-4')]//button)[2]").click();
				//driver.findElementByXPath("(//div[(@class='col-md-6')]/following :: button)[3]").click();
				//Scroll Down and Click Book Now button
				JavascriptExecutor jse = (JavascriptExecutor)cd;
				jse.executeScript("window.scrollBy(0,700)", "");
				WebDriverWait wait = new WebDriverWait(cd, 30);
				wait.until(ExpectedConditions.elementToBeClickable(cd.findElementByXPath("(//div[(@class='col-md-6')]/button)[2]"))).click();
				//Click Confirm Booking button
				cd.findElementByXPath("(//div[(@class='form-group')]/button)").click();
				Thread.sleep(4000);
				//Click Pay on Arrival Button 
				cd.findElementByXPath("(//button[starts-with(@class, 'btn')])[1]").click();
				cd.switchTo().alert().accept();
				//Click My Account button
				cd.findElementByXPath("(//a[(@class='dropdown-toggle go-text-right')])[2]").click();
				//Click Logout button
				wait.until(ExpectedConditions.elementToBeClickable(cd.findElementByXPath("html/body/div[3]/div/div/div[2]/ul/ul/li[1]/ul/li[2]/a"))).click();
				cd.close();	
			}
	}


