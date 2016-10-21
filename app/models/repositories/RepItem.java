package models.repositories;

import java.util.List;

import play.db.ebean.Model.Finder;
import models.data.Item;

public class RepItem implements IRep<Item>{

	public Finder<Long, Item> itemFinder;
	
	public RepItem() {
		itemFinder = new Finder<Long, Item>(Long.class, Item.class);
	}
	
	@Override
	public List<Item> getAll() {
		return itemFinder.all();
	}

	@Override
	public Item findById(long id) {
		return itemFinder.byId(id);
	}

	@Override
	public void save(Item item) {
		item.save();
	}

	@Override
	public void delete(long id) {
		itemFinder.ref(id).delete();
	}

}
