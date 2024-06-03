package com.ey.question1;

public class StudentTest {
	public static void main(String[] args) {
		StudentService ss= new StudentService();
		
		
		Address a1=new Address("Pedavadlapudi");
		Student s1=new Student("sai","Meghana",a1);
		
		Address a2=new Address("Mangalagiri");
		Student s2=new Student("sai","Sashank",a2);
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		
	}

}
