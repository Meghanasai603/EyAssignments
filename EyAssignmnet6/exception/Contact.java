package com.ey.exception;


import java.util.Stack;

class Contactdetails{
	String fname;
	String mname;
	String lname;
	String gender;
	String dob;
	String number;
	public Contactdetails(String fname, String mname, String lname, String gender,String dob, String number) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contactclass [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", gender=" + gender
				+ ", number=" + number + "]";
	}
	
}


public class Contact {
	
	public static void main(String[] args) {
		Contactdetails c1=new Contactdetails("Meghana", "Sai", "Challapalli","31-01-2002", "Female", "9865204245");
		
		Stack<Contactdetails> s=new Stack<>();
		s.push(c1);
		System.out.println(s);
		//s.pop();
		try {
			s.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Contactdetails c2=new Contactdetails("Sashank", "Sai1", "Challapalli1", "26-09-2004","male", "832466559");
		
		try {
			s.push(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			s.push(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}

}