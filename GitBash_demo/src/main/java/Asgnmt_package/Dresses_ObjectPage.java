package Asgnmt_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_ObjectPage extends Dresses_BasePage {
	
	//Women tab
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")	
	private WebElement WomenTab;	
	public WebElement getWomenTab() {
		return WomenTab; 
	}
	
	//Dresses tab
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement DressesTab;
	public WebElement getDressesTab() {
		return DressesTab;
	}
	
	//T-shirts tab
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[3]/a")
	private WebElement TshirtsTab;
	public WebElement getTshirtsTab() {
		return TshirtsTab;
	}
	
	
	//Constructor
	public Dresses_ObjectPage() {
		PageFactory.initElements(driver,this);
	}

}