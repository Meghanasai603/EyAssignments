package com.ey.task4;

import java.util.Date;

//public class StudentTester
//{
public class StudentTester
{
	public static void main(String[]args) {
		Student[] student=new Student[5];
		student[0]=new Student("Meghana",new Date(103,4,6),new Integer[] {76,70,87});
		student[1]=new Student("lata",new Date(100,2,17),new Integer[] {45,43,68});
		student[2]=new Student("Meda",new Date(166,4,6),new Integer[] {71,50,97});
		student[3]=new Student("Meghana2",new Date(103,4,6),new Integer[] {76,70,87});
		student[4]=new Student("Meghana3",new Date(103,4,6),new Integer[] {76,70,87});
		
		StudentService sc=new StudentService();
		sc.displayallStudents(student);
	}
	
	
}
		
	
	
	
	
	
	
	/*public void showStudentDetails(Student[] students)
		{
			if(students!=null) {
				\
					if(student!=null) {
						System.out.println("School Nmae: "+Student.getSchoolName());
						System.out.println(student);
						System.out.println();
					}
				}
			}else {
				System.out.println("No students to display.");
			}
		}
	
		public static void main(String[] args) 
		{
			Student[] students=new Student[5];
			StudentValidator validator=new StudentValidator();
			Student student1=new Student("Meghana",new Date (103,4,6),new Integer[] {76,70,87});
			Student student2=new Student("lata",new Date(100,2,17),new Integer[] {45,43,68});
			Student student3=new Student("Meda",new Date(166,4,6),new Integer[] {71,50,97});
			Student student4=new Student("jona",new Date(196,2,61),new Integer[] {21,90,67});
			Student student5=new Student("seda",new Date(106,41,26),new Integer[] {91,51,41});
			
		
			if(validator.isValidStudent(student1))students[0]=student1;
			if(validator.isValidStudent(student2))students[1]=student2;
			if(validator.isValidStudent(student3))students[2]=student3;
			if(validator.isValidStudent(student4))students[3]=student4;
			if(validator.isValidStudent(student5))students[4]=student5;
			
			StudentTester manager=new StudentTester();
			manager.showStudentDetails(students);
		
		 }*/
//}
	 


