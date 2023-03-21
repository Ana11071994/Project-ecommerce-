package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Baseclass {
	public PojoClass() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//i[@class='icon-myaccount']")
	private WebElement acc;
	@FindBy(xpath="(//input[@type='email'])[1]")
	private WebElement email;
	@FindBy(xpath="//input[@name='loginPassword']")
	private WebElement passwd;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	@FindBy(xpath="//a[text()='New']")
	private WebElement first;
	@FindBy(xpath="(//li[@class='nav-item dropdown'])[2]//a[@id='women']")
	private WebElement women;
	@FindBy(xpath="(//a[text()='Dresses'])[1]")
	private WebElement dress1;
	@FindBy(xpath="(//a[@class='link'])[1]")
	private WebElement midi;
	@FindBy(xpath="//a[@title='Select Size 10']")
	private WebElement size;
	@FindBy(xpath="//button[@class='add-to-cart btn btn-custom']")
	private WebElement cart;
	@FindBy(xpath="//button[@class='add-to-cart btn btn-custom']")
	private WebElement cart1;
	@FindBy(xpath="//a[@id='new']")
	private WebElement first1;
	@FindBy(xpath="(//li[@class='nav-item dropdown'])[3]")
	private WebElement men;
	@FindBy(xpath="(//a[text()='Shirts'])[1]")
	private WebElement shirt;
	@FindBy(xpath="(//a[@class='link'])[2]")
	private WebElement stripe;
	@FindBy(xpath="//a[@title='Select Size M']")
	private WebElement size1;
	@FindBy(xpath="//button[@class='add-to-cart btn btn-custom']")
	private WebElement cart1a;
	@FindBy(xpath="//button[@class='add-to-cart btn btn-custom']")
	private WebElement cart2a;
	@FindBy(xpath="(//i[@class='minicart-icon icon-bag'])[1]")
	private WebElement cartlist;
	@FindBy(xpath="(//select[@class='form-control quantity custom-select'])[1]")
	private WebElement addQty1;
	@FindBy(xpath="(//select[@class='form-control quantity custom-select'])[2]")
	private WebElement addQty2;
	@FindBy(xpath="(//div[@class='pricing line-item-total-price-amount item-total-null'])[1]")
	private WebElement Prodcostwomen;
	@FindBy(xpath="(//div[@class='pricing line-item-total-price-amount item-total-null'])[2]")
	private WebElement Prodcostmen;
	@FindBy(xpath="(//div[@class='row cart-sumary-prices'])[1]")
	private WebElement deliverycost;
	@FindBy(xpath="(//div[@class='row cart-sumary-prices'])[2]")
	private WebElement Gst;
	@FindBy(xpath="(//div[@class='row cart-sumary-prices'])[3]")
	private WebElement Totalcost;
	@FindBy(xpath="//ul[@class='nav navbar-nav']")
	private WebElement ss;
	public WebElement getAcc() {
		return acc;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPasswd() {
		return passwd;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getDress1() {
		return dress1;
	}
	public WebElement getMidi() {
		return midi;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getCart1() {
		return cart1;
	}
	public WebElement getFirst1() {
		return first1;
	}
	public WebElement getMen() {
		return men;
	}
	public WebElement getShirt() {
		return shirt;
	}
	public WebElement getStripe() {
		return stripe;
	}
	public WebElement getSize1() {
		return size1;
	}
	public WebElement getCart1a() {
		return cart1a;
	}
	public WebElement getCart2a() {
		return cart2a;
	}
	public WebElement getCartlist() {
		return cartlist;
	}
	public WebElement getAddQty1() {
		return addQty1;
	}
	public WebElement getAddQty2() {
		return addQty2;
	}
	public WebElement getProdcostwomen() {
		return Prodcostwomen;
	}
	public WebElement getProdcostmen() {
		return Prodcostmen;
	}
	public WebElement getDeliverycost() {
		return deliverycost;
	}
	public WebElement getGst() {
		return Gst;
	}
	public WebElement getTotalcost() {
		return Totalcost;
	}
	public WebElement getSs() {
		return ss;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
