package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClase {
	
	
public WebDriver driver;

public Logger logger;
public Properties p;

private String host;

private int port;

	@BeforeClass(groups= {"sanity","regression"})
	@Parameters({"browser"})
	public void setUp(String br) throws IOException   {
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
		switch(br) {
		case "chrome" :driver=new ChromeDriver(); break;
		case "firefox":driver=new FirefoxDriver(); break;
		case "edge":driver=new EdgeDriver(); break;
		
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appUrl"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups= {"sanity","regression"})
	public void logout() {
		driver.close();
		
	}
	
	public String randomstring() {
		String randamStrings=RandomStringUtils.randomAlphanumeric(5);
		return randamStrings;
	
}}
