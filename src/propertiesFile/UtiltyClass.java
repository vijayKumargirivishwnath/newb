package propertiesFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//use of properties file in project
public class UtiltyClass {
//take data from confi.properties file 
static WebDriver driver=null;
public static WebDriver openBrowser() throws IOException
{
FileInputStream fis=new FileInputStream("config.properties");	
Properties p=new Properties(); 
p.load(fis);
String browser=p.getProperty("browser");
if(browser.equals("chrome"))
{
System.setProperty("webdriver.chrome.driver", "F:\\driver\\chrome driver\\chromedriver.exe");
driver=new ChromeDriver();	
}
if(browser.equals("firefox"))
{
System.setProperty("webdriver.gecko.driver", "F:\\driver\\geckodriver driver\\geckodriver.exe");
driver=new FirefoxDriver();	
}
if(browser.equals("ie"))
{
System.setProperty("webdriver.ie.driver", "F:\\driver\\ie driver\\IEDriverserver.exe");
driver=new InternetExplorerDriver();	
}
return driver;
}
public static void openUrl() throws IOException
{
FileInputStream fis=new FileInputStream("config.properties");	
Properties p=new Properties(); 
p.load(fis);
String url=p.getProperty("url");	
driver.get(url);
}

public static void clickButton(String locname,String locvalue)
{
	if(locname.equals("id"))
	{
	driver.findElement(By.id(locvalue)).click();
	}
	if(locname.equals("xpath"))
	{
	driver.findElement(By.xpath(locvalue)).click();
	}
	if(locname.equals("name"))
	{
	driver.findElement(By.name(locvalue)).click();
	}
	if(locname.equals("css"))
	{
	driver.findElement(By.cssSelector(locvalue)).click();
	}
	if(locname.equals("tagname"))
	{
	driver.findElement(By.tagName(locvalue)).click();
	}
	}






















}

