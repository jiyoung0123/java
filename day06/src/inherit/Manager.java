package inherit;

//Manager는 Employee에서 상속받는 관계라는 뜻
public class Manager extends Employee {
	private double bonus;

	// constructor는 상속이 안되기 때문에 내가 다시 생성해야 함
	// 단 상위에 있는 코드를 활용하여 생성 가능
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	// 함수의 재정의(overriding)
	//상위에서 정의한 함수를 다시 정의
	@Override
	public double getAnnSalary() {
		
		double result = 0.0;
		// Manager라는 class에 salary가 있기는 하지만, 코드상 접근이 안됨. 왜냐하면 Em에서 private이었으니
		// 그래서 salary를 protected로 바꾸기
		// 혹은 Em에서 getsalary(Getter 생성)생성해서 하기
		//result = (this.getSalary() + this.bonus) * 12;
		
		//상위 클래스의 getAnnSalary 가져다씀
		result = super.getAnnSalary() + (this.bonus*12);
		return result;
	}

	@Override
	public String toString() {
		//상위에 있는 tostring도 추가를 하는것
		//super는 위에 있는 코드를 빌려쓰겠다. 라는뜻
		return super.toString()+" "+bonus;
	}

}
