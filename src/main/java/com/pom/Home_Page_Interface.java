package com.pom;

public interface Home_Page_Interface {
	
	String select_gender_id = "shopMen";
	String men_click_Xpath ="//div[contains(text(),'Men')]";
	String mouse_hover_Xpath ="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[2]";
	String Select_TShirt = "(//a[text()='t-shirts'])[1]";
	String get_product_xpath = "(//div[@class='dTc fs11 fwB h40 vM ttU']//following::div[@class='prdC bgF br4 fs12 fg2t dIb vT pR taC bs bd2E   m6'])[1]";

	String get_product_size_xpath ="(//div[@class='sizeChartInit bs c3 fs11 fwN p4 pA r8 t8 tdU ']//following::div[@class='br10 dIb mr10 vT c4 pt12 fs16 ttU taC wsN size '])[3]";
    String Add_to_Cart_xpath="//div[@data-pgn='Add to Cart']";
	String buy_now_Xpath= "//a[text() ='BUY NOW']";

}
