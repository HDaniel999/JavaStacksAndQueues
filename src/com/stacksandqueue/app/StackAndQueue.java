package com.stacksandqueue.app;

import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {
		
		String cad = "oAchewecodocjwqodcoijokeAjqcowjpxsalkznxijrruvgwjskazcxvhgfArtf482uioqwksladmcfnvgytp489u3qopwiAruytrhbwjqskamxc.";
		
		Stack<Character> letters = new Stack<Character>();
		
		char[] lettersArray = cad.toCharArray();
		
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A') 
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		/*
		for(Character c: letters)
		{
			System.out.println(letters.pop());
		}
		*/
		
	}

}
