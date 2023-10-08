package com.opencart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage 

{

	private WebDriver driver;
	public Searchpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By search_txtbox = By.xpath("//input[@placeholder='Search']");
	private By search_butn = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By compaire_productlist = By.xpath("//button[@id='list-view']");
	private By product_macbook =  By.xpath("//input[@name='search']");
	private By product_macbookair =  By.xpath("//i[@class='fa fa-search']");
    private By product_compaire =  By.xpath("//a[@id='compare-total']");
	
	public void searchText(String search)
	{
		driver.findElement(search_txtbox).sendKeys("macbook");
	}
	
	public void searchButton()
	{
		driver.findElement(search_butn).click();
	}
	
	public void compaireproductlist()
	{
		driver.findElement(compaire_productlist).click();
	}
	
	public void productmacbook()
	{
		driver.findElement(product_macbook).click();
	}
	
	public void productmacbookair()
	{
		driver.findElement(product_macbookair).click();
	}
	
	public void productcompaire()
	{
		driver.findElement(product_compaire).click();
	}
}
