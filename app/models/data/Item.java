package models.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Item extends Model {
	
	@Id
	public long id;
	
	@Required
	public String name;

	@Required
	public double value;
	
}