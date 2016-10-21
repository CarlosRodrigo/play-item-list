package models.collections;

import java.util.List;

import models.data.Coupon;
import models.repositories.IRep;
import models.repositories.RepCoupon;

public class CouponCollection {

	private IRep<Coupon> repCoupon;
	
	public CouponCollection() {
		repCoupon = new RepCoupon();
	}
	
	public void updateCoupon(Coupon coupon) {
		repCoupon.save(coupon);
	}
	
	public void removeCoupon(long id) {
		if (repCoupon.findById(id) != null) {
			repCoupon.delete(id);
		}
	}
	
	public Coupon getCoupon(long id) {
		return repCoupon.findById(id);
	}
	
	public List<Coupon> getAllCoupons() {
		return repCoupon.getAll();
	}
	
	public void useCoupon(long id) {
		Coupon coupon = repCoupon.findById(id);
		coupon.useCupom();
		repCoupon.save(coupon);
	}
	
}
