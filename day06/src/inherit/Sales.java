package inherit;

public class Sales extends Employee {
	private String loc;
	private double rate;
	
	
	public Sales() {
	}




	public Sales(String id, String name, double salary) {
		super(id, name, salary);
		
	}
	
	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}




	@Override
	public String toString() {
		return super.toString()+" "+loc+" "+rate;
	}




	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary()+(this.getIncentive()*12);
		return result;
		
	}
	
	
	//@Override는 안 써도 되지만, 이걸 씀으로써 오타를 최소화 할 수가 있다. 오타나면 빨간줄 나니깐...
	@Override
	//Employee 에서 getIncentive가 없었는데 만들어주고 여기서 Override함
	public double getIncentive() { 
		double result=0.0;
		result = getSalary()*this.rate;
		return result;
	}


}
