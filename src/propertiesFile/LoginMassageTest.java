package propertiesFile;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class LoginMassageTest {
@Test(dataProvider = "loginData")
public void allTestcasesoflogin(String testCaseId,String testDesc,String uname,String password,String expMassage) throws IOException
{
UtiltyClass.openBrowser();
UtiltyClass.openUrl();
UtiltyClass.driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys(uname);
UtiltyClass.driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys(password);
UtiltyClass.clickButton("xpath", "/html/body/div/div[2]/form/div[3]/div/button");
String actErrorMassage="";
String expErrorMassage="";
}
@Test
public void blackidpassword() throws IOException
{
UtiltyClass.openBrowser();
UtiltyClass.openUrl();
}

@Test
public void correctidpassword() throws IOException
{
UtiltyClass.openBrowser();
UtiltyClass.openUrl();
}
}
