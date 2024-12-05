package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class f22 {
	WebDriver driver;

@Test

public void datadriven() throws InterruptedException

{

String excelFilePath = "C:\\Users\\User\\Desktop\\Book2.xlsx";

System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
driver=new ChromeDriver();

try {

FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

Workbook workbook = new XSSFWorkbook(inputStream);

Sheet sheet = workbook.getSheetAt(0);

for (int i = 2; i <= sheet.getLastRowNum(); i++) {

Row row = sheet.getRow(i);

// Get data from the current row

String userid = row.getCell(0).getStringCellValue();

String password = row.getCell(1).getStringCellValue();
String repeatpassword = row.getCell(2).getStringCellValue();
String fristname = row.getCell(3).getStringCellValue();
String lastname = row.getCell(4).getStringCellValue();
String emailid = row.getCell(5).getStringCellValue();
int phonenumber = row.getPhysicalNumberOfCells();
String address1 = row.getCell(7).getStringCellValue();
String address2 = row.getCell(8).getStringCellValue();
String city = row.getCell(9).getStringCellValue();
String state = row.getCell(10).getStringCellValue();
int zip = row.getPhysicalNumberOfCells();
String country = row.getCell(12).getStringCellValue();






driver.get("https://petstore.octoperf.com/actions/Catalog.action");

driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userid);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys(repeatpassword);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(fristname);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys(emailid);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys(String.valueOf(phonenumber));
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys(address1);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input")).sendKeys(address2);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input")).sendKeys(city);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input")).sendKeys(state);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input")).sendKeys(String.valueOf(zip));
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input")).sendKeys(country);
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();




Thread.sleep(3000);

}

workbook.close();

inputStream.close();

} catch (IOException e) {

e.printStackTrace();

}

// Close the browser

driver.quit();

}

}
