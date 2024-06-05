package com.ey.exception;
import java.util.*;
class AccountErrorException extends RuntimeException{
	AccountErrorException(String msg){
		super(msg);
	}
}

public class AccountChecker {
	
	boolean isvalidaccount(Set keys,int a) {
		if(keys.contains(a))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Map<Integer, String> m =new HashMap<Integer, String>();
		m.put(101, "sai");
		m.put(102, "lux");
		m.put(103, "jen");
		m.put(104, "pug");
		m.put(105, "don");
		Set keys=m.keySet();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the acc number");
		int acc=sc.nextInt();
		AccountChecker ac=new AccountChecker();
		boolean b=ac.isvalidaccount(keys,acc);
		if(b) {
			System.out.println(m.get(acc));
		}
		else
			throw new AccountErrorException("There is no user with this account");
	}
	

}