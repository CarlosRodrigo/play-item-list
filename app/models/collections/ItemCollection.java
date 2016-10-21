package models.collections;

import java.util.List;

import models.data.Item;
import models.repositories.IRep;
import models.repositories.RepItem;

public class ItemCollection {

	private IRep<Item> repItem;
	
	public ItemCollection() {
		repItem = new RepItem();
	}
	
	public void saveItem(Item item) {
		repItem.save(item);
	}
	
	public void removeItem(long id) {
		if (repItem.findById(id) != null) {
			repItem.delete(id);
		}
	}
	
	public Item getItem(long id) {
		return repItem.findById(id);
	}
	
	public List<Item> getAllItems() {
		return repItem.getAll();
	}
	
}
