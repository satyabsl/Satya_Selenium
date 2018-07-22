package com.k2js.handson.stretchtask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoZurmo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..\\Browserexes\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("http://demo.zurmo.com");
		WebElement we1 = cd.findElement(By.id("LoginForm_username"));
		we1.sendKeys("super");
		WebElement we2 = cd.findElement(By.id("LoginForm_password"));
		we2.sendKeys("super");
		WebElement we3 = cd.findElementByClassName("z-label");
		we3.click();
		// Mouse hover Create on top navigation bar and click on Account
		WebElement we4 = cd.findElementById("ShortcutsMenu");
		Actions action = new Actions(cd);
		action.moveToElement(we4).build().perform();
		// action.moveToElement(menu).perform();
		WebElement we5 = cd.findElement(By.xpath(".//*[@id='ShortcutsMenu']/li/ul/li[1]/a/span"));
		we5.click();
		// Create account by filing all details
		cd.findElementById("Account_name").sendKeys("Diamond_Selenium");
		cd.findElementById("Account_officePhone").sendKeys("0802500000");
		cd.findElementById("Account_industry_value").sendKeys("Retail");
		cd.findElementById("Account_officeFax").sendKeys("080123456");
		cd.findElementById("Account_employees").sendKeys("32");
		cd.findElementById("Account_annualRevenue").sendKeys("50000");
		cd.findElementById("Account_website").sendKeys("www.google.com");
		cd.findElementByName("Account[billingAddress][street1]").sendKeys("Subramanya Arcade");
		cd.findElementByName("Account[billingAddress][street2]").sendKeys("Bannerghatta Road");
		cd.findElementByName("Account[billingAddress][city]").sendKeys("Bangalore");
		cd.findElementByName("Account[billingAddress][state]").sendKeys("Karnataka");
		cd.findElementByName("Account[billingAddress][postalCode]").sendKeys("560029");
		cd.findElementByName("Account[billingAddress][country]").sendKeys("INDIA");
		cd.findElementByClassName("z-label").click();
		//Click the Account on LNav for Search the accounts
		cd.findElementByXPath(".//*[@id='accounts']/a/span").click();
		//Enter the name for Search Criteria
		cd.findElementByXPath(".//*[@id='AccountsSearchForm_anyMixedAttributes']").sendKeys("Diamond_Selenium");
		Thread.sleep(5000);
		cd.findElementByXPath("(//tr[(@class='odd')]/td[3]/a)").click();
		//Click the Option and Edit the details
		cd.findElementByXPath("(//div[(@class='view-toolbar')]/ul/li/a/span)").click();
		cd.findElementByXPath("(//li[(@id='EditLinkActionElement')]/a)").click();
		//Modify/Adding Shipping Address
		cd.findElementById("Account_shippingAddress_street1").sendKeys("Plot No: 9, First Avenue");
		cd.findElementById("Account_shippingAddress_street2").sendKeys("Gangotri circle");
		cd.findElementById("Account_shippingAddress_city").sendKeys("Bangalore");
		cd.findElementById("Account_shippingAddress_state").sendKeys("Karnataka");
		cd.findElementById("Account_shippingAddress_postalCode").sendKeys("500056");
		cd.findElementById("Account_shippingAddress_country").sendKeys("INDIA");
		//Modify the Billing Address Section (Street 2 section)
		cd.findElementById("Account_billingAddress_street2").clear();
		cd.findElementById("Account_billingAddress_street2").sendKeys("Udupi Garden Stop, BTM");
		//Modify and click the save button
		cd.findElementByClassName("z-label").click();
		//Click the Logout button
		cd.findElementByClassName("avatar-holder").click();
		cd.findElementByXPath("(//ul[(@id='user-header-menu')]/li/ul//li[4]/a)").click();	
		cd.close();
	}

}
