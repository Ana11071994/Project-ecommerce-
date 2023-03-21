package org.sample;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainExe extends Baseclass {
	SoftAssert s;
	PojoClass p;
	@BeforeClass
	private void befcls() {
		chromebrowser();
		geturl("https://www.jeanswest.com.au/");
		maximize();

	}
	@Test(groups="sanity")
	private void t1() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test(groups="smoke")
	private void t2() throws IOException {
		 p = new PojoClass();
		implicitytimeout();
		WebElement acc = p.getAcc();
		acc.click();
		WebElement user = p.getEmail();
		fillbox(user,"anand110794@gmail.com");
		WebElement pass = p.getPasswd();
		implicitytimeout();
		fillbox( pass,"Ana11nd@94");
		WebElement login = p.getLogin();
		login.click();
		s.assertAll();
		
	}
	@Test(groups="regression",priority=-20)
	private void t3() {
		String title = driver.getTitle();
		s.assertTrue(title.contains("JEANSWEST"),"check title");
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		s.assertAll();
	}
	@Test(groups="sanity",enabled=false)
	private void t4(String user, String pass) {
		WebElement acc = p.getAcc();
		acc.click();
		WebElement email = p.getEmail();
		fillbox(email, user);
		WebElement passwd = p.getPasswd();
		fillbox(passwd, pass);

	}
	@Test(groups="smoke")
	private void t5() {
		 p = new PojoClass(); 
	   WebElement first1 = p.getFirst();
		first1.click();
		WebElement women = p.getWomen();
		mouseover(women);
		WebElement dress1 = p.getDress1();
		dress1.click();
		WebElement midi = p.getMidi();
		midi.click();
		WebElement size = p.getSize();
		mouseoverclick(size);
		WebElement cart = p.getCart();
		mouseover(cart);
		WebElement cart1 = p.getCart1();
		cart1.click();
		}
	@Test(groups="regression")
	private void t6() {
		 p = new PojoClass(); 
		WebElement first1 = p.getFirst1();
		first1.click();
		WebElement men = p.getMen();
		mouseover(men);
		WebElement shirt = p.getShirt();
		shirt.click();
		WebElement stripe = p.getStripe();
		stripe.click();
		WebElement size1 = p.getSize1();
		size1.click();
		WebElement cart1a = p.getCart1a();
		mouseover(cart1a);
		WebElement cart2a = p.getCart2a();
		cart2a.click();
		WebElement cartlist = p.getCartlist();
		 cartlist.click();
	}
	
	@Test(groups="smoke")
	private void t7() {
		 p = new PojoClass();
		WebElement addQty1 = p.getAddQty1();
		selectindex(addQty1, 2);
		WebElement addQty2 = p.getAddQty2();
		selectindex(addQty2, 3);
		WebElement prodcostwomen = p.getProdcostwomen();
		gettext(prodcostwomen, "a");
		WebElement prodcostmen = p.getProdcostmen();
		gettext(prodcostmen, "a");
	
	}
	@Test(groups="regression")
	private void t8() throws IOException {
		 p = new PojoClass();
		WebElement deliverycost = p.getDeliverycost();
        gettext(deliverycost, "a");
        WebElement gst = p.getGst();
        gettext(gst, "a");
        WebElement totalcost = p.getTotalcost();
        gettext(totalcost, "a");
        WebElement ss = p.getSs();
        Screenshot(ss);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
