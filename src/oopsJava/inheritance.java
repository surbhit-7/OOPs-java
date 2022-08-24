package oopsJava;

import java.util.ArrayList;

// Single Inheritance Implementation
//class Person{
//	
//	protected String name;
//	protected int age;
//	
//	 Person(String name2, int age) {
//			// TODO Auto-generated constructor stub
//		 	this.name = name2;
//		 	this.age = age;
//		}
//}
//
//class Profession extends Person{
//	String worktype;
//	
//	Profession(String name, int age , String worktype)
//	{
//		super(name,age);
//		this.worktype = worktype;
//	}
//
//	public String toString() {
//		return "Name:  " + name + ", Age: " + age + ", Profession: " + worktype  ;
//	}
//}

// Multilevel Inheritance implementation -
//class Person{
//	
//	protected String name;
//	protected int age;
//	
//	 Person(String name2, int age) {
//			// TODO Auto-generated constructor stub
//		 	this.name = name2;
//		 	this.age = age;
//		}
//}
//
//class Profession extends Person{
//	String worktype;
//	
//	Profession(String name, int age , String worktype)
//	{
//		super(name,age);
//		this.worktype = worktype;
//	}
//
//	public String toString() {
//		return "Name:  " + name + ", Age: " + age + ", Profession: " + worktype  ;
//	}
//}
//
//class Skills extends Profession
//{
//	ArrayList<String> skills;
//	Skills(String name, int age ,String worktype, ArrayList<String> arr)
//	{	
//		super(name,age,worktype);
//		skills = arr;
//	}
//	
//	void printSkills()
//	{
//		System.out.println(name + " has skills "+ skills + " with profession : " + worktype);
//	}
//}

// Hierarichal Inheritance-
//class Person{
//	
//	protected String name;
//	protected int age;
//	
//	 Person(String name2, int age) {
//			// TODO Auto-generated constructor stub
//		 	this.name = name2;
//		 	this.age = age;
//		}
//}
//
//class Profession extends Person{
//	String worktype;
//	
//	Profession(String name, int age , String worktype)
//	{
//		super(name,age);
//		this.worktype = worktype;
//	}
//
//	public String toString() {
//		return "Name:  " + name + ", Age: " + age + ", Profession: " + worktype  ;
//	}
//}
//
//class Skills extends Person
//{
//	ArrayList<String> skills;
//	Skills(String name, int age , ArrayList<String> arr)
//	{	
//		super(name,age);
//		skills = arr;
//	}
//	
//	void printSkills()
//	{
//		System.out.println(name + " has skills "+ skills );
//	}
//}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// Single inheritance practice -
//		Profession p1 = new Profession("Surbhit",23,"Software Developer");
//		System.out.println(p1.toString());
		
//		// Multilevel Inheritance -
//		ArrayList<String> str = new ArrayList<String>();
//	       str.add("CPP");
//	       str.add("HTML");
//	       str.add("JAVA");	
//	       
//	       Skills sk = new Skills("Surbhit", 12, "Berozgari", str);
//	       sk.printSkills();
		
		//Hierarichal Inheritance -
//		ArrayList<String> str = new ArrayList<String>();
//		str.add("CPP");
//	    str.add("HTML");
//	    str.add("JAVA");	
//	    Skills s1 = new Skills ("Surbhit",  24, str);
//	    Profession p1 = new Profession("Surbhit",22,"berozgarr");
//	    
//	    s1.printSkills();
//	    System.out.println(p1);
	       
	}

}
