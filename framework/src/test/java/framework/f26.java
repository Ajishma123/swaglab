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

public class f26 {
	WebDriver driver;

	@Test

	public void datadriven() throws InterruptedException

	{

	String excelFilePath = "C:\\Users\\User\\Desktop\\Book6.xlsx";

	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();

	try {

	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	Workbook workbook = new XSSFWorkbook(inputStream);

	Sheet sheet = workbook.getSheetAt(0);

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	Row row = sheet.getRow(i);

	// Get data from the current row

	String usmail = row.getCell(0).getStringCellValue();

	String username = row.getCell(1).getStringCellValue();
	String fristname = row.getCell(2).getStringCellValue();
	String lastname = row.getCell(3).getStringCellValue();
	String userpass = row.getCell(4).getStringCellValue();
	String usercon = row.getCell(5).getStringCellValue();
	String nick = row.getCell(6).getStringCellValue();
	String flowe = row.getCell(7).getStringCellValue();
	driver.get("https://demo.wpeverest.com/user-registration/column-2/");

	driver.manage().window().maximize();
	driver.findElement(By.id("user_email")).sendKeys(usmail);
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("first_name")).sendKeys(fristname);
	driver.findElement(By.id("last_name")).sendKeys(lastname);
	driver.findElement(By.id("user_pass")).sendKeys(userpass);
	driver.findElement(By.id("user_confirm_password")).sendKeys(usercon);
	driver.findElement(By.id("nickname")).sendKeys(nick);
	driver.findElement(By.id("user_url")).sendKeys(flowe);
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-16\"]/form/div[5]/button")).click();

	


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
