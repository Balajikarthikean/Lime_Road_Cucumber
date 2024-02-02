package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

public class Home_Page extends Base_Class implements Home_Page_Interface {
	

//	@FindBy(id = "shopMen")
//	private WebElement men;
//	public WebElement getElement() {
//		return men;
//	}
//	
//	@FindBy(xpath = "//div[contains(text(),'Men')]")
//	private WebElement menClick;
//	public WebElement getMenClick() {
//		return menClick;
//	}
//
//	
//	@FindBy(xpath="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[2]")
//	private WebElement overmenoption;
//	public WebElement getOvermenoption() {
//		return overmenoption;
//	}
//	
//	@FindBy(xpath = "(//a[text()='t-shirts'])[1]")
//	private WebElement TShirts;
//    public WebElement getTShirts() {
//		return TShirts;
//	}
//    
//    @FindBy(id ="659fc10c13cb38081ce67dca")
//    private WebElement product;
//    public WebElement getProduct() {
//		return product;
//	}
//    
//    @FindBy(id="19114456")
//    private WebElement productItem;
//    public WebElement getProductItem() {
//		return productItem;
//	}
//	
//    @FindBy(id="size_30993352")
//    private WebElement productSize;
//	
//	public WebElement getProductSize() {
//		return productSize;
//	}
//	@FindBy(xpath ="//div[@data-b='19114456']")
//	private WebElement addtocart;
//	public WebElement getAddtocart() {
//		return addtocart;
//	}
//	
//	@FindBy(xpath="//a[text() ='BUY NOW']")
//	private WebElement buynow;
//	public WebElement getBuynow() {
//		return buynow;
//	}
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(id = select_gender_id)
	private WebElement men;
	public WebElement getElement() {
		return men;
	}
	
	@FindBy(xpath =men_click_Xpath )
	private WebElement menClick;
	public WebElement getMenClick() {
		return menClick;
	}

	
	@FindBy(xpath=mouse_hover_Xpath)
	private WebElement overmenoption;
	public WebElement getOvermenoption() {
		return overmenoption;
	}
	
	@FindBy(xpath = Select_TShirt)
	private WebElement TShirts;
    public WebElement getTShirts() {
		return TShirts;
	}
    
    @FindBy(xpath  =get_product_xpath)
    private WebElement product;
    public WebElement getProduct() {
		return product;
	}
    
    @FindBy(id=get_product_item_id)
    private WebElement productItem;
    public WebElement getProductItem() {
		return productItem;
	}
	
    @FindBy(id=get_product_size_id)
    private WebElement productSize;
	
	public WebElement getProductSize() {
		return productSize;
	}
	@FindBy(xpath =Add_to_Cart_xpath)
	private WebElement addtocart;
	public WebElement getAddtocart() {
		return addtocart;
	}
	
	@FindBy(xpath= buy_now_Xpath)
	private WebElement buynow;
	public WebElement getBuynow() {
		return buynow;
	}
}
