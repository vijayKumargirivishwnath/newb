package propertiesFile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
public class ReadPropertisFile {
public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("config.properties");	

Properties p=new Properties(); 
p.load(fis);
ChromeDriver driver=new ChromeDriver();
String browser=p.getProperty("browser");
System.out.println(browser);
String url=p.getProperty("url");
System.out.println(url);
String operatingsystem=p.getProperty("operatingsystem");
System.out.println(operatingsystem);
driver.get(url);
}
}
