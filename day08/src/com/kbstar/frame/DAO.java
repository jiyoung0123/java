package com.kbstar.frame;

public interface DAO<K,V> {
	//무엇이 들어올지는 모르겠으나, k 타입이 들어오거나 v 타입이 들어올거라고 하는것이 제네릭 임--2개의 type이 들어올 거란 전제
	//키 값의 타입과 밸류의 타입은 나중에 정하겠다... 라는 뜻
	
	
	//public static final String IP = "127.0.0.1";	
	//상수는 통상적으로 대문자를 사용을 한다
	//앞에 안 써도 자동으로 public static final 이 붙는거임
	String IP = "127.0.0.1";
 
	
	//obj.getid는 쓸 수가 없다. 왜냐하면, getid는 UserDTO(자식)에서 정의됨.
    //public void insert(Object obj);			
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
	
	default void connect() {
		System.out.println(IP+"에 접속 하였습니다.");
		
	}
	default void close() {
		System.out.println(IP+"에 접속을 해제 하였습니다.");
		
		
	}

}
