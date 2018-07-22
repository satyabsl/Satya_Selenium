package com.k2js.handson.stretchtask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "..\\Browserexes\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("http://www.automationpractice.com");
		//Click the Sign In
		cd.findElementByClassName("login").click();
		//Enter the Username
		cd.findElementById("email").sendKeys("satyartr@in.ibm.com");
		//Enter the Password
		cd.findElementById("passwd").sendKeys("Selenium");
		//Click the Signin 
		cd.findElementById("SubmitLogin").click();
		//Click the Dressess Tab
		cd.findElementByXPath(".//*[@id='block_top_menu']/ul/li[2]/a").click();
		//Click the Causal dress link
		cd.findElementByXPath(".//*[@id='subcategories']/ul/li[1]/div[1]/a/img").click();
		//Click the List Icon
		cd.findElementByClassName("icon-th-list").click();
		//Click the More Button
		cd.findElementByXPath("(//div[starts-with(@class, 'button')])//a[2]").click();
		//Click the Add Cart Button
		cd.findElementById("add_to_cart").click();
		//click the Proceed to CheckOut button New Window
		//cd.findElementByXPath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span").click();
		new WebDriverWait(cd, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[(@class='button-container')]/a/span"))).click();
		//Click to Proceed to Checkout button [Summary]
		cd.findElementByXPath("//p[starts-with(@class, 'cart_navigation')]/a/span").click();
		//Click to Proceed to Checkout button [Address]
		cd.findElementByXPath("(//p[starts-with(@class, 'cart_navigation')])/button/span").click();
		//Click the Agree checkbox
		cd.findElementById("cgv").click();
		//Click to proceed to checkout button [Shipping]
		cd.findElementByXPath("(//p[starts-with(@class, 'cart_navigation')])/button/span").click();
		//click the Pay by Check option
		cd.findElementByXPath("(//p[@class='payment_module']/a/span)[2]").click();
		//Click the Confirm my Order[Payment]
		cd.findElementByXPath("//p[starts-with(@class, 'cart_navigation')]/button/span").click();
		//Click the Logout button
		cd.findElementByClassName("logout").click();	
		//driver.close();
	}

}
