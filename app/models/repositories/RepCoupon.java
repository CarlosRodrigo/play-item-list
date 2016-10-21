package models.repositories;

import java.util.List;

import play.db.ebean.Model.Finder;
import models.data.Coupon;

public class RepCoupon implements IRep<Coupon> {

	public Finder<Long, Coupon> counponFinder;
	
	public RepCoupon() {
		counponFinder = new Finder<Long, Coupon>(Long.class, Coupon.class);
	}
	
	@Override
	public List<Coupon> getAll() {
		return counponFinder.all();
	}

	@Override
	public Coupon findById(long id) {
		return counponFinder.byId(id);
	}

	@Override
	public void save(Coupon coupon) {
		coupon.save();
	}

	@Override
	public void delete(long id) {
		counponFinder.ref(id).delete();
	}
	
}
