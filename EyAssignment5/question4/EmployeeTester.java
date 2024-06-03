package com.ey.question4;



public class EmployeeTester {
	public static void main(String[] args) {
		EmployeeValidator ev= new EmployeeValidator();
		Employee e1=new Employee(1,"sai","Meghana");
		Employee e2=new Employee(2,"sri","vyshnavi");
		Employee e3=new Employee(3,"laxshmi","Satvika");
		Employee e4=new Employee(4,"ramya","lahari");
		Employee e5=new Employee(5,"sai","Sushma");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		
		ev.list();
		
		ev.fnamesort();
		
	}

}
