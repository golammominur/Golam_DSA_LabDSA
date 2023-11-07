package com.greatlearning.lab;
import java.util.Stack;
public class BalancingBrackets {

public static void main(String []args) {
	String input="( [ [ { } ] ] )";
	boolean result=checkBalancedBracket(input);
	if(result) {
		System.out.println("The entered String has Balanced Brackets ");
	}
	else {
		System.out.println("The entered Strings do not contain Balanced Brackets");
	}
	}
	static boolean checkBalancedBracket(String input) {
		Stack<Character>stack=new Stack<>();
		
		for(int i=0;i<input.length();i++) {
            char c=input.charAt(i);
        
            if(c=='('|| c=='{' || c=='[') {
            	stack.push(c);
            	continue;
            	}
            if(stack.isEmpty()) {
            	return false ;
            	}
            
            char temp;
            switch(c) {
            case ')':
            	temp=stack.pop();
            	if(temp=='{'|| temp=='[') {
            		return false;
            	}
            	break;
            case '}':
            	temp=stack.pop();
            	if(temp=='('|| temp=='[') {
            		return false;
            		}
            	break;
            case ']':
            	temp=stack.pop();
            	if(temp=='('|| temp=='{') {
            		return false;
            		}
            	break;
           
		}
		}
		return stack.isEmpty();
	}
	
	}




