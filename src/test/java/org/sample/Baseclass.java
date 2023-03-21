package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass {
public static WebDriver driver;

public static void chromebrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
public static void geturl(String url) {
driver.get(url);
}
public static void implicitytimeout() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
}
public static void maximize() {
	driver.manage().window().maximize();

}
public static void fillbox(WebElement ref , String key) {
	ref.sendKeys(key);

}
public static void click(WebElement ref) {
	ref.click();
	
}
public static void selectindex(WebElement ref,int index) {
	Select s = new Select(ref);
	s.selectByIndex(index);

}
public static void scrollpage(WebElement ref) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", ref);
	js.executeScript("arguments[0].scrollIntoView(false)", ref);
}
public static void setattribute(String key , WebElement ref) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript(key, ref);

}
public static void gettext(WebElement ref , String key) {
	String a = ref.getText();
	System.out.println(a);

}
public static void mouseover(WebElement ref) {
	Actions a  = new Actions(driver);
	a.moveToElement(ref).perform();
	
}
public static void mouseoverclick(WebElement ref) {
	Actions a  = new Actions(driver);
	a.doubleClick(ref).perform();

}
public static void keyboard(WebElement ref) throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	

}
public static void Screenshot(WebElement ref) throws IOException {
    TakesScreenshot tk = (TakesScreenshot) driver;
    File s = tk.getScreenshotAs(OutputType.FILE);
    File d = new File("C:\\Users\\Kannan\\eclipse-workspace\\Project\\Screenshot\\img.png");
    FileUtils.copyFile(s, d);

}
	



public static String readexcelsheet5(int rowno , int cellno) throws IOException {
	File f = new File("C:\\Users\\Kannan\\eclipse-workspace\\Project\\excel\\Book1.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet("Sheet5");
	Row r = sh.getRow(rowno);
	Cell c = r.getCell(cellno);
	int type = c.getCellType();
	String name = "";
	if (type==1) {
		name = c.getStringCellValue();//used to get value present in cell
		
	}
	else if (DateUtil.isCellDateFormatted(c)) {
		Date dcv = c.getDateCellValue();
		SimpleDateFormat form = new SimpleDateFormat("dd/mm/yyyy");
		name = form.format(dcv);
		
	}
	else {
		double d = c.getNumericCellValue();
		long l = (long) d;
		name = String.valueOf(l);
	}

	return name;

}








































}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


