package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Asgnmt_package.Dresses_BasePage;
import Asgnmt_package.Dresses_ObjectPage;

public class Dresses_Test {
	Dresses_BasePage bp;
	Dresses_ObjectPage op;
	
	public Dresses_Test() {
		bp = new Dresses_BasePage();
		op = new Dresses_ObjectPage();
	}
	
	//Verify Women tag
	@Test
	public void verifyWomenTab() {
		Assert.assertTrue(bp.elementFound(op.getWomenTab()), "Failed to verify Women tab");
	}
	
	@Test
	public void verifyDressesTab() {
		Assert.assertTrue(bp.elementFound(op.getDressesTab()),"Failed to verify Dresses Tab");
	}
	
	@Test
	public void verifyTshirtsTab() {
		Assert.assertTrue(bp.elementFound(op.getTshirtsTab()),"Failed to verify TShirts tab");
	}
	@Test
	public void verifyWomenTab_onClick() {
		op.getWomenTab().click();
	}
	
	@Test
	public void verifyDressesTab_onClick() {
		op.getDressesTab().click();
	}
	
	@Test
	public void verifyTShirtsTab_onClick() {
		op.getTshirtsTab().click();
	}
	
	
}
