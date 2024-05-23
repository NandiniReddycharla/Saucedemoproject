package saucedemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static Properties props;
	public static WebDriver driver;
	
	public BaseClass() {
		props=new Properties();
		try {
			FileInputStream fis=new FileInputStream(".\\src\\main\\java\\saucedemo\\config\\config.properties");
		props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName=props.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("Edge")) {
			driver=new EdgeDriver();
		}
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(props.getProperty("url"));
	}
	
		
	}


