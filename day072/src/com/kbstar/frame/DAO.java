package com.kbstar.frame;

public interface DAO<K,V> {
	//무엇이 들어올지는 모르겠으나, k 타입이 들어오거나 v 타입이 들어올거라고 하는것이 제네릭 임--2개의 type이 들어올 거란 전제
	//키 값의 타입과 밸류의 타입은 나중에 정하겠다... 라는 뜻
	
	//obj.getid는 쓸 수가 없다. 왜냐하면, getid는 UserDTO(자식)에서 정의됨.
	//public void insert(Object obj);
	
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
	

}
