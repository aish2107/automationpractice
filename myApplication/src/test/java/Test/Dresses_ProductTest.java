package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Asgnmt_package.Dresses_BasePage;
import Asgnmt_package.Dresses_ObjectPage;
import Asgnmt_package.Dresses_ProductPage;

public class Dresses_ProductTest {
	
	Dresses_BasePage bp;
	Dresses_ProductPage pp;
	Dresses_ObjectPage op;
	
	public Dresses_ProductTest() {
		bp = new Dresses_BasePage();
		op = new Dresses_ObjectPage();
		pp = new Dresses_ProductPage();
	}
	
	
	@Test
	public void verifysizes() {
		Assert.assertTrue(bp.isElementVisible(pp.getsizeSCheckbox()),"Failed to display Size S ");
		Assert.assertTrue(bp.isElementVisible(pp.getsizeMCheckbox()), "Failed to display size M ");
		Assert.assertTrue(bp.isElementVisible(pp.getsizeLCheckbox()),"Failed to display size L");
	}
	
	
	//@Test
	//public void verifyProductCount() {
	//	Assert.assertEquals(op.ResultCount(), "Product Count & Result Count are equal", "Failed since product count & result count are not equal");
//	}
	
	@Test
	public void verifyNewsLetterSubscription() {
		bp.setText(pp.newsLetterSubscription(), "i20@gmail.com");
		pp.subscribe_Btn().click();
		pp.getAlertMsg();
		System.out.println("Alert Msg==>>"+pp.getAlertMsg());
	}
	
	@Test
	public void verify_FirstProduct_addedtoCart() {
		op.getDressesTab().click();
		bp.mouseHover(pp.addFirstProduct());		
		
		System.out.println("After op.addFirstProduct function call and before executing pp.addToCart() function ");
		pp.addToCart();
		//System.out.println("product added msg==>>"+pp.product_AddedMsg());
		//System.out.println("product in cart text==>>"+op.product_in_Cart().getText());
	}
}
