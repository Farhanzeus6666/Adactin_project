package com.adactin.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.DownAction;

import com.adactin.baseclass.BaseClassa;
import com.adactin.runner.Runner;
import com.loginpage.org.BookHotel;
import com.loginpage.org.LoginPage;
import com.loginpage.org.LogoutPage;
import com.loginpage.org.SearchHotel;
import com.loginpage.org.SelectHotel;

import cucumber.api.Scenario;
import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClassa{
	
	
	public static WebDriver driver = Runner.driver;
	
	LoginPage lp = new LoginPage(driver);
	
	@Before
	private void beforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
		System.out.println("Scenario status : " + status);
		

	}
	
	@After
	private void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\FARHAN\\eclipse-workspace\\Adactin_Project\\Screenshott\\img.png");
			
		}
	    System.out.println("Exit from the page");
	}
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		url("https://adactinhotelapp.com/");
		System.out.println("url passed");
	   
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		inputofElement(lp.getUsername(), arg1);
	   
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		inputofElement(lp.getPassword(), arg1);
	  
	}
	
	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	   clickonElement(lp.getLogin());
	}


	@Then("^User Validate the username and password$")
	public void user_Validate_the_username_and_password() throws Throwable {
		
	//=============================================================================   
	}
    
	SearchHotel sh = new SearchHotel(driver);
	
	@When("^user select location$")
	public void user_select_location() throws Throwable {
		clickonElement(sh.getLocation());
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("enter");
		
	    
	}

	@When("^user select  hotel$")
	public void user_select_hotel() throws Throwable {
		clickonElement(sh.getHotel());
		robot("down");
		robot("down");
		robot("down");
		robot("down");
	    robot("enter");
		
	  
	}

	@When("^user select room type$")
	public void user_select_room_type() throws Throwable {
		clickonElement(sh.getRoomtype());
		robot("down");
		robot("down");
		robot("down");
		robot("enter");
	}

	@When("^user select number of rooms$")
	public void user_select_number_of_rooms() throws Throwable {
		clickonElement(sh.getRoomnos());
		robot("down");
		robot("down");
		robot("down");
        robot("enter");
	   
	}

	@When("^user enter \"([^\"]*)\" as check in date$")
	public void user_enter_as_check_in_date(String arg1) throws Throwable {
		inputofElement(sh.getCheckin(), "25/06/2021");
	}
	   
	

	@When("^user enter \"([^\"]*)\" as check out date$")
	public void user_enter_as_check_out_date(String arg1) throws Throwable {
		inputofElement(sh.getCheckout(), "27/06/2021");
		
	}
		
	   

	@When("^user select adult per room$")
	public void user_select_adult_per_room() throws Throwable {
		clickonElement(sh.getAdultroom());
		robot("down");
		robot("down");
		robot("down");
        robot("enter");

	   
	}

	@When("^user select the children per room$")
	public void user_select_the_children_per_room() throws Throwable {
		clickonElement(sh.getChildroom());
		robot("down");
		robot("down");
        robot("enter");

	   
	}

	@Then("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		clickonElement(sh.getSubmit());
		
	}

	//========================================
	
	SelectHotel s = new SelectHotel(driver);
	
	@When("^user select hotel$")
	public void user_select_hotel1() throws Throwable {
		clickonElement(s.getRadiobutton());
	   
	}

	@Then("^user click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		clickonElement(s.getContinuee());
	   
	}

//========================================================
	
	BookHotel bk = new BookHotel(driver);
	
	@When("^user enter first name$")
	public void user_enter_first_name() throws Throwable {
		inputofElement(bk.getFirstname(), "mohamed");
	   
	}

	@When("^user enter the second name$")
	public void user_enter_the_second_name() throws Throwable {
		inputofElement(bk.getLastname(), "farhan");
		
		
	    
	}
	
	@When("^user enter address$")
	public void user_enter_address() throws Throwable {
	   inputofElement(bk.getAddress(), "no 12/40/g.a.a.khan");
	}



	@When("^user enter credit card number$")
	public void user_enter_credit_card_number() throws Throwable {
		inputofElement(bk.getCreditnum(), "1234567890987654");
	   
	}

	@When("^user enter cardtype$")
	public void user_enter_cardtype() throws Throwable {
		clickonElement(bk.getCctype());
		robot("down");
		robot("down");
		robot("enter");
	    
	}

	@When("^user enter exp month$")
	public void user_enter_exp_month() throws Throwable {
		clickonElement(bk.getExpmonth());
		robot("down");
		robot("down");
		robot("enter");
	    
	}

	@When("^user enter exp year$")
	public void user_enter_exp_year() throws Throwable {
		clickonElement(bk.getExpyear());
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("down");
		robot("enter");
		
	}
	   

	@When("^user enter the cvv number$")
	public void user_enter_the_cvv_number() throws Throwable {
		inputofElement(bk.getCvvnum(), "234");
	    
	}

	@Then("^user book the hotel$")
	public void user_book_the_hotel() throws Throwable {
		clickonElement(bk.getBooknow());
	   
	}

	//===========================================
	
	LogoutPage l = new LogoutPage(driver);
	
	@When("^user click the logout$")
	public void user_click_the_logout() throws Throwable {
	   clickonElement(l.getLogout()); 
	}


	
	

}
