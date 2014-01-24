package br.com.handson.library.interfaces.dao;

import java.util.List;

public interface GenericDAO<T> {

	void saveOrUpdate(T entity);
	void delete(T entity); 
	List<T> list();
	
}
