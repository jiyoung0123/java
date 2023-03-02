package board;

public class Service {
	//dao가 필요함
	DAO dao;
	
	
	//생성자
	public Service() {		
		//service라는 class를 생성을 할 때 dao를 초기화함
		dao = new DAO();
	}
	
	//메서드
	public void register(String str) {
		//Security or Log
		dao.insert(str);
		
	}

	public void remove(int num) {
		dao.delete(num);		
	}
	
	public void modify(int num, String str) {
		dao.update(num, str);
		
	}
	
	public String get(int num) {
		
		return dao.select(num);
	}
}
