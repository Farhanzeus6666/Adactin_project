package com.loginpage.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomnos;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy(id = "Submit")
	private WebElement submit;

	public SearchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
				
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
