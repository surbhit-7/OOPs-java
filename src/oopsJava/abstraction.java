package oopsJava;

abstract class HumanInfo {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	HumanInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	abstract void Speaks();
	
}

class Employee extends HumanInfo{
	String designation;
	Employee(String name, int age, String des)
	{
		super(name,age);
		this.designation = des;
	}
	@Override
	void Speaks() {
		// TODO Auto-generated method stub
		System.out.println("OlaAAAAAAAAAAAAA" + " My name is " + this.getName() + " age is "
				+ this.getAge() + " and designation is " + designation);
		
	}
	
	
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Surbhit",23,"SDE at Hansen");
		e.Speaks();
	}

}
