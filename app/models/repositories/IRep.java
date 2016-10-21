package models.repositories;

import java.util.List;

public interface IRep<T> {

	public List<T> getAll();
	
	public T findById(long id);
	
	public void save(T entity);
	
	public void delete(long id);
}
