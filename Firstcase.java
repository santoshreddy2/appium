package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Firstcase { 
	@Test
	public void test1() throws MalformedURLException, InterruptedException{
	 
	// Create object of  DesiredCapabilities class and specify android platform
	DesiredCapabilities capabilities=DesiredCapabilities.android();
	 
	 
		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	   capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	 
	// we need to define platform name
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 
	// Set the device name as well (you can give any name)
	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"GT-S7262");
	 
	 // set the android version as well 
	   capabilities.setCapability(MobileCapabilityType.VERSION,"4.1.2");
	 
	 // Create object of URL class and specify the appium server address
	 URL url= new URL("http://127.0.0.1:4723/wd/hub");
	 
	// Create object of  AndroidDriver class and pass the url and capability that we created
	 WebDriver driver = new AndroidDriver(url, capabilities);
	 Thread.sleep(2000);
	// Open url
	  driver.get("https://m.facebook.com/");
	 
	 // print the title
	  System.out.println("Title "+driver.getTitle());
	 
	// enter username
	driver.findElement(By.name("email")).sendKeys("vinaykumars1209@gmail.comm");
	 
	// enter password
	      driver.findElement(By.name("pass")).sendKeys("Vinay535");
	 
	// click on submit button
	driver.findElement(By.id("u_0_6")).click();
	 
	Thread.sleep(5000);

	// close the browser
	driver.quit();
	 
	 
	 
	 
	}
	 
	}


