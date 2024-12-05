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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class f28 {
	WebDriver driver;

	@Test

	public void datadriven() throws InterruptedException

	{

	String excelFilePath = "C:\\Users\\User\\Desktop\\book\\Book8.xlsx";

	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();

	try {

	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	Workbook workbook = new XSSFWorkbook(inputStream);

	Sheet sheet = workbook.getSheetAt(0);

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	Row row = sheet.getRow(i);

	// Get data from the current row

	String name = row.getCell(0).getStringCellValue();

	String last = row.getCell(1).getStringCellValue();
	String mail = row.getCell(2).getStringCellValue();
	String distric = row.getCell(3).getStringCellValue();
	String state = row.getCell(4).getStringCellValue();
	String countyr = row.getCell(5).getStringCellValue();
	int zip = row.getPhysicalNumberOfCells();
	int number=row.getPhysicalNumberOfCells();
	String mailid = row.getCell(8).getStringCellValue();
	String confmaild = row.getCell(9).getStringCellValue();
	String pass = row.getCell(10).getStringCellValue();
	String uspass = row.getCell(11).getStringCellValue();
	driver.get("https://demo.wpeverest.com/user-registration/course-registration-form/");

	driver.manage().window().maximize();
	driver.findElement(By.id("first_name")).sendKeys(name);
	driver.findElement(By.id("last_name")).sendKeys(last);
	driver.findElement(By.id("textarea_1623050614")).sendKeys(mail);
	driver.findElement(By.id("input_box_1623050696")).sendKeys(distric);
	driver.findElement(By.id("input_box_1623050759")).sendKeys(state);
	driver.findElement(By.id("country_1623050729")).sendKeys(countyr);
	driver.findElement(By.id("input_box_1623050879")).sendKeys(String.valueOf(zip));
	driver.findElement(By.name("phone_1623051660")).sendKeys(String.valueOf(number));
	driver.findElement(By.xpath("//*[@id=\"radio_1623051748_field\"]/ul/li[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"date_box_1623051693_field\"]/span/input[1]")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).sendKeys("00002012");
	WebElement testDropDown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
	Select dropdown=new Select(testDropDown);
	dropdown.selectByVisibleText("March");
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[17]")).click();
	driver.findElement(By.id("user_email")).sendKeys(mailid);
	driver.findElement(By.id("user_confirm_email")).sendKeys(confmaild);
	driver.findElement(By.id("user_pass")).sendKeys(pass);
	driver.findElement(By.id("user_confirm_password")).sendKeys(uspass);
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-303\"]/form/div[7]/button")).click();
}
	


	Thread.sleep(3000);

	

	workbook.close();

	inputStream.close();

	} catch (IOException e) {

	e.printStackTrace();

	}

	// Close the browser

	driver.quit();

	}

}
