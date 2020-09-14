package com.act.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginToApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//		System .setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_3.150.12\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.manage().window().maximize();
	boolean flg=driver.findElement(By.xpath("//td[@class='logoCell navCell']")).isDisplayed();
	if(flg==true)
	{
		System.out.println("Logo Displayed");
	}
	else
	{
		System.out.println("LOgo Not Displayed");
	}
	System.out.println("Print msg");
	//Assert.assertTrue(flg);
	
		
		

	}

}
