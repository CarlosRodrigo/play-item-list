package models.repositories;

import java.util.List;

import models.data.Coupon;

public interface IRep<T> {

	public List<Coupon> getAll();
	
	public Coupon findById(long id);
	
	public void save(Coupon coupon);
	
	public void delete(long id);
}
