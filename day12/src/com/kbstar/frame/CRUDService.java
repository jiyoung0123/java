package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K,V> {
	//사용자가 회원가입을 한다 라는 의미
	
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;

}
