package com.learning.check;

import java.util.Stack;

public class CheckBalancedBrackets {
	
	public  boolean check(String expr)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<expr.length();i++)
		{
			char a = expr.charAt(i);
			
			if(a=='(' || a=='{' || a=='[')
			{
				stack.push(a);
				continue;
			}
			if(stack.isEmpty())
			{
				return false;
			}
			char check;
			switch(a)
			{
			case ')':
				check = stack.pop();
				if(check == '{' || check =='[')
				{
					return false;
				}
				break;
			case '}':
				check = stack.pop();
				if(check == '(' || check =='[')
				{
					return false;
				}
				break;
			case ']':
				check = stack.pop();
				if(check == '{' || check =='(')
				{
					return false;
				}
				break;
			}
			
			
			}
			
	return stack.isEmpty();
			
		}
	
	
	
	}
	
	


