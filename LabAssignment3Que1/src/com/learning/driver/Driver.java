package com.learning.driver;

import com.learning.check.CheckBalancedBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "([{)])";
		CheckBalancedBrackets ch= new CheckBalancedBrackets();
		 if(ch.check(str))
		 {
			 System.out.println("Balanced");
		 }
		 else
		 {
			 System.out.println("Not balanced");
		 }

	}

}
