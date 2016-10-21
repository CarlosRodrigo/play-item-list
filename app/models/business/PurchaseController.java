package models.business;

import java.util.List;

import models.collections.CouponCollection;
import models.collections.ItemCollection;
import models.data.Item;

public class PurchaseController {

	private ItemCollection itemCollection;
	private CouponCollection couponCollection;
	
	public PurchaseController() {
		itemCollection = new ItemCollection();
		couponCollection = new CouponCollection();
	}
	
	public void purchaseItem(Item item) {
		itemCollection.saveItem(item);
	}
	
	public List<Item> getItems() {
		return itemCollection.getAllItems();
	}
	
}
