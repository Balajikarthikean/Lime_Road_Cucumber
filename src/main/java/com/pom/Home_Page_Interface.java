package com.pom;

public interface Home_Page_Interface {
	
	String select_gender_id = "shopMen";
	String men_click_Xpath ="//div[contains(text(),'Men')]";
	String mouse_hover_Xpath ="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[2]";
	String Select_TShirt = "(//a[text()='t-shirts'])[1]";
	String get_product_xpath = "(//div[@class='dTc fs11 fwB h40 vM ttU']//following::div[@class='prdC bgF br4 fs12 fg2t dIb vT pR taC bs bd2E   m6'])[1]";
	String  get_product_item_id ="19114456";
	String get_product_size_id ="size_30993352";
    String Add_to_Cart_xpath="//div[@data-b='19114456']";
	String buy_now_Xpath= "//a[text() ='BUY NOW']";

}
