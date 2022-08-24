package oopsJava;

class PhoneContacts{
	private String name;
	private int phone_number;
	
//	Compile time polymorphism
//	Function Overloading
	PhoneContacts(String Name)
	{
		this.name = Name;
		phone_number = 12312312;
	}
	
	PhoneContacts(String Name,int pn)
	{
		this.name = Name;
		phone_number = pn;
	}

	void sayHello()
	{
		System.out.println("Hello inside phonecontact class");
	}
	
}

class Person extends PhoneContacts{
	String name ;
	
	Person(String cn,int num, String name)
	{
		super(cn,num);
		this.name = name;
	}
	
//	Overrides the function
//	RunTime Polymorphism achieved
	void sayHello()
	{
		System.out.println("Hello inside Person class");
	}
	
}


public class polymorphism {
	public static void main(String args[])
	{
//		Compile time :-
		PhoneContacts p = new PhoneContacts("hashas",1313123);
		p.sayHello();

//		Run Time Polynmorphism -	
		Person p1 = new Person("dhashd",21312321,"kasdjka");
		p1.sayHello();
	}
}
