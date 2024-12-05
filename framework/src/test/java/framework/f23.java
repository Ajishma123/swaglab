package framework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f23 {
	WebDriver driver;

	@Test

	public void datadriven() throws InterruptedException

	{

	String excelFilePath = "C:\\Users\\User\\Desktop\\Book3.xlsx";

	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();

	try {

	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	Workbook workbook = new XSSFWorkbook(inputStream);

	Sheet sheet = workbook.getSheetAt(0);

	for (int i = 2; i <= sheet.getLastRowNum(); i++) {

	Row row = sheet.getRow(i);

	// Get data from the current row

	String name = row.getCell(0).getStringCellValue();

	String lastName = row.getCell(1).getStringCellValue();
	String addressstreet = row.getCell(2).getStringCellValue();
	String addresscity = row.getCell(3).getStringCellValue();
	String addressstate = row.getCell(4).getStringCellValue();
	int addresszipCode = row.getPhysicalNumberOfCells();
	int phoneNumber = row.getPhysicalNumberOfCells();
	int customerssn = row.getPhysicalNumberOfCells();
	String username = row.getCell(8).getStringCellValue();
	String password = row.getCell(9).getStringCellValue();
	String repeatedPassword = row.getCell(10).getStringCellValue();
	



	driver.get("https://parabank.parasoft.com/parabank/register.htm");

	driver.manage().window().maximize();

	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	driver.findElement(By.id("customer.firstName")).sendKeys(name);
	driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
	driver.findElement(By.id("customer.address.street")).sendKeys(addressstreet);
	driver.findElement(By.id("customer.address.city")).sendKeys(addresscity);
	driver.findElement(By.id("customer.address.state")).sendKeys(addressstate);
	driver.findElement(By.id("customer.address.zipCode")).sendKeys(String.valueOf(addresszipCode));
	driver.findElement(By.id("customer.phoneNumber")).sendKeys(String.valueOf(phoneNumber));
	driver.findElement(By.id("customer.ssn")).sendKeys(String.valueOf(customerssn));
	driver.findElement(By.id("customer.username")).sendKeys(username);
	driver.findElement(By.id("customer.password")).sendKeys(password);
	driver.findElement(By.id("repeatedPassword")).sendKeys(repeatedPassword);
	driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	


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
