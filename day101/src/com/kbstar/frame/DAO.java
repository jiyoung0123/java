package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {
	
	//interface를 설계하면서, generic 으로 하고, exception도 던짐
	//이게 일반적인 CRUD 이다. create, read(2개의 select), update, delete
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;
	public List<V>select() throws Exception;

}
