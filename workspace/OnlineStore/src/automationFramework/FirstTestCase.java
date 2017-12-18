package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {
	
	

	public static void main(String[] args) throws InterruptedException {
		
	  
		
		int test1 = 100;
		String sOne= "hello";
		
		
		System.out.println("Test1=" + test1);
		System.out.println("Sone=" + sOne);
		//driver.get(sAppURL);
		//LaunchFireFox2();
		LaunchFireFox();
		//LaunchChrome("http://www.store.demoqa.com");
		//LaunchMicrosoftEdge();
		
	}
	
	
			public static void LaunchChrome(String Url) throws InterruptedException {
			 	// Create a new instance of the Chrome driver
				String exePath = "C:\\Aut_Drivers\\chromedriver.exe";
			    System.setProperty("webdriver.chrome.driver",exePath); 
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");  
				
				WebDriver driver = new ChromeDriver(options);	
				
	              //String appUrl = "https://accounts.google.com";
				  String appUrl = Url; //"http://www.store.demoqa.com";
				  //Launch the Website
	              driver.get(appUrl); 
					
			    // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com, W/Chrome");
				//Wait for 5 Sec
				Thread.sleep(10000);
		        // Close the driver
		        driver.quit();
				}
	
			
			public static void LaunchFireFox2()
			{
				System.setProperty("webdriver.firefox.marionette","C:\\Aut_Drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			 	//Launch the Online Store Website
			 	String sAppURL = "http://www.store.demoqa.com";
			 	driver.get(sAppURL);
			 	 System.out.println(driver.switchTo().alert().getText());
			}
			
			public static void LaunchFireFox() throws InterruptedException {
				
				// Create a new instance of the Firefox driver
				System.setProperty("webdriver.gecko.driver","C:\\Aut_Drivers\\geckodriver.exe");//This is the location where you have installed geckodriver on your machine
				//System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
				//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
				FirefoxOptions options = new FirefoxOptions();
				options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
				//"C:\Program Files\Mozilla Firefox\firefox.exe"
				//"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"
			 	FirefoxDriver driver = new FirefoxDriver(options);
			 	
			 	//Launch the Online Store Website
			 	String sAppURL = "http://www.store.demoqa.com";
			 	driver.get(sAppURL);
			 	// Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com, W/FireFox");
		 		//Wait for 5 Sec
				Thread.sleep(10000);
				
				String sTitle = driver.getTitle();			
				System.out.println("The title is " + sTitle);
				System.out.println("The title lenth is " + sTitle.length());
				
				
				
				String sActuralUrl = driver.getCurrentUrl();
				if (sActuralUrl.equals(sAppURL)){
					System.out.println("Verification Successful - The correct Url is opened.");
				}else{
					System.out.println("Verification Failed - An incorrect Url is opened.");
					//In case of Fail, you like to print the actual and expected URL for the record purpose
					System.out.println("Actual URL is : " + sActuralUrl);
					System.out.println("Expected URL is : " + sAppURL);
				}		
			
				
				String sPageSource = driver.getPageSource();
				int pageSourceLength = sPageSource.length();
				System.out.println("The total lenth of the page source is " + pageSourceLength);
				
		        // Close the driver
		        driver.quit();
		    						
			}


			public static void LaunchMicrosoftEdge() throws InterruptedException {
				// Create a new instance of the Chrome driver
				System.setProperty("webdriver.edge.driver","C:\\Aut_Drivers\\MicrosoftWebDriver.exe");
				WebDriver driver = new EdgeDriver();
		        //Launch the Online Store Website
				driver.get("http://www.store.demoqa.com");
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com, W/Edgee");
				//Wait for 5 Sec
				Thread.sleep(10000);
		        // Close the driver
		        driver.quit();
				
				
			   }

}
