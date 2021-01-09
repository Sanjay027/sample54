 package org.com;

import java.io.IOException;

import javax.security.auth.login.LoginContext;
import javax.swing.text.PasswordView;

import org.apache.xmlbeans.impl.store.SaxonXBeansDelegate.QueryInterface;
import org.net.BaseClass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adatatin_Main_Page  extends BaseClass1{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	
		chromeBrowserLaunch();
		LaunchURL("http://adactinhotelapp.com/");
		
		pom1_class ad1 = new pom1_class();
		
		WebElement a = ad1.getUsername();
		sendKeys(a,readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1,0));
	
		WebElement password = ad1.getPassword();
		sendKeys(password, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 1));
		
		Thread.sleep(2000);
		
         WebElement login = ad1.getLogin();
         login.click();
      
        pom2_class ad2 = new pom2_class();
        
        WebElement location = ad2.getLocation1();
        selectVisibleText(location, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 2));
     
   //     selectIndex(location, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 2));
     
        WebElement hotels = ad2.getHotels();
        sendKeys(hotels, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 3));
        
        WebElement room_type = ad2.getRoom_type();
        sendKeys(room_type, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 4));
        
        WebElement room_nos = ad2.getRoom_nos();
        sendKeys(room_nos, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 5));
        
        
        WebElement datepick_in = ad2.getDatepick_in();
        sendKeys(datepick_in, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1",1, 6));

        
        WebElement datepick_out = ad2.getDatepick_out();
        sendKeys(datepick_out, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 7));

        
        WebElement adult_room = ad2.getAdult_room();
        sendKeys(adult_room, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 8));
        
        WebElement child_room = ad2.getChild_room();
        sendKeys(child_room, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 9));
        
        WebElement submit = ad2.getSubmit();
       submit.click();
        
        
        pom3_class ad3 = new pom3_class();
        
        Thread.sleep(3000);
        
       WebElement radiobutton_0 = ad3.getRadiobutton_0();
       radiobutton_0.click();
      
       
       WebElement continue1 = ad3.getContinue1();
       continue1.click();
        
        pom4_class ad4= new pom4_class();
        
        WebElement first_name = ad4.getFirst_name();
        sendKeys(first_name, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 10));
        
        
        WebElement last_name = ad4.getLast_name();
       sendKeys(last_name, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 11));
       
       WebElement address = ad4.getAddress();
       sendKeys(address,readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 12));
       
       WebElement cc_num = ad4.getCc_num();
       sendKeys(cc_num, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 13));
 
       WebElement cc_type = ad4.getCc_type();
       sendKeys(cc_type, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 14));
       
       WebElement cc_exp_month = ad4.getCc_exp_month();
       sendKeys(cc_exp_month, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 15));
       
       WebElement cc_exp_year = ad4.getCc_exp_year();
       sendKeys(cc_exp_year, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 16));
        
       WebElement cc_cvv = ad4.getCc_cvv();
       sendKeys(cc_cvv, readExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", "Sheet1", 1, 17));
        
       WebElement book_now = ad4.getBook_now();
       book_now.click();
       
       Thread.sleep(5000);
       
       WebElement order_no = ad4.getOrder_no();
       String text = getAttribute(order_no);
       
       
      // writeExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", row, cell, value);
       
       writeExcel("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\Adatin_1\\XmlFile\\ExcelRead.xlsx", 3, 18, text, "Sheet1");
     
       
       //driver.quit();
	}

	
	    
}
