package com.step;


import org.openqa.selenium.interactions.Actions;

import com.base.Base_Class;
import com.pom.Home_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	 
	

	Home_Page hp = new Home_Page();

	@Given("user enter url {string}")
	public void user_enter_url(String string) {

		launchUrl(string);
	}
	@When("user click Men")
	public void user_click_men() throws InterruptedException {
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		//a.click(hp.getElement()).perform();
		hp.getElement().click();
	}

	@Given("user select  men option")
	public void user_select_men_option() {
//		clickUsingAction();
	}
	@When("user select  Tshirts option")
	public void user_select_Tshirts_option() throws InterruptedException {
		
		Thread.sleep(10000);
		actionmoveElement(hp.getMenClick());
		Thread.sleep(10000);
		clickButton(hp.getTShirts());
	}
	@And("user select product")
	public void user_select_product() throws InterruptedException {
		Thread.sleep(10000);
	    clickElement(hp.getProduct());
	}
	@And("user selected product item")
	public void user_selected_product_item() throws InterruptedException {
		Thread.sleep(10000);
	    clickElement(hp.getProductItem());
	}
	@And("user select the size of the product")
	public void user_select_the_size_of_the_product() throws InterruptedException {
		Thread.sleep(10000);
	    hp.getProductSize().click();
	}
    
	@And("user click add to cart")
	public void user_click_add_to_cart() throws InterruptedException {
		Thread.sleep(10000);
		clickElement(hp.getAddtocart());
	}

	@And("user click Buynow")
	public void user_click_buynow() throws InterruptedException {
		Thread.sleep(10000);
		clickElement(hp.getBuynow());
	}

}
