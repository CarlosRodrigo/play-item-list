package models.data;

import javax.persistence.Entity;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Coupon extends Model {
	
	@Required
	public boolean used;
	
	public void useCupom() {
		used = false;
	}
}
