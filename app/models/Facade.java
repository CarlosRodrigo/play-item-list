package models;

import models.business.PurchaseController;
import models.data.Item;

public class Facade {

	private PurchaseController purchaseController;
	private static Facade instance;
	
	public Facade() {
		purchaseController = new PurchaseController();
	}
	
	public static Facade getInstance() {
		if (instance == null) {
			instance = new Facade();
		}
		
		return instance;
	}
	
	public void purchaseItem(Item item) {
		purchaseController.purchaseItem(item);
	}
}
