package db;

public interface DAO {
	//interface 안에는 추상함수, 기능만 정의를 내림
	
	//뭐든지 다 담을 수 있는게 Object
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	
	
	

}
