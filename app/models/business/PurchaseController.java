package models.business;

import models.collections.CouponCollection;
import models.collections.ItemCollection;
import models.data.Item;

public class PurchaseController {

	private ItemCollection itemCollection;
	private CouponCollection couponCollection;
	
	public PurchaseController() {
		couponCollection = new CouponCollection();
	}
	
	public void purchaseItem(Item item) {
		itemCollection.saveItem(item);
	}
	
}
