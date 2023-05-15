package com.balmes.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {

	List<T> list();

//CREATE	
	T create(T t);
	
	Optional<T> get(int id);

//UPDATE	
	void update(T t, int id);

//DELETE	
	void delete(int id);
	
}
