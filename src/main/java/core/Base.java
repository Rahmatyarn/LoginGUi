package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties; //This will provide the key and value from property.properties. You will give the key
	//it will return the value.
	public static Logger logger;
	private String propertyPath = ".\\src\\text\\resources\\input\\property.properties";  
	//Right click - properties and copy the address add a . at the beggining
	private String log4JPath = ".\\src\\text\\resources\\input\\log4j.properties";
	
	// Create a constructor and it's job is to invoke and initialize all the methods and variables in this class.
	// We need to use a class to read the data from properties file. Bufferred reader or scanner or file input stream can be used. 
	// The job of BufferedReader to read the data from the file you specifying by characters. 
	public Base() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
			properties = new Properties();
			properties.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger = logger.getLogger("logger_file");
		PropertyConfigurator.configure(log4JPath);
		
		}
	// In this class we are calling the browser from property.properties class
	public static String getBrowserName() {
		String browserName = properties.getProperty("browser");
		return browserName;
				
	}
	// In this class we are call the url from property.properties class
	public static String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
	
	// 
		public static void openBrowser() {
			driver.get(getUrl());
			
		}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	// In this method we are selecting out of multiple drivers. 
	public static void selectBrowser() {
		String browsers = getBrowserName();
		if(browsers.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		} 
		else if (browsers.equalsIgnoreCase("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}	
		else if (browsers.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

}
