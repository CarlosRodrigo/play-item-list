package models.data;

import javax.persistence.Entity;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Item extends Model {
	
	@Required
	public String name;

	@Required
	public double value;
	
}