package com.jonthompsondf.codefix;

import java.util.ArrayList;
import java.util.List;

public class SimpleClass {

	public static String NON_CONST_PUBLIC_STATIC = "bad";
	
	public static void main(String[] args) {
		List<String> things = new ArrayList<String>();
		for(int i=0; i<10; i++) {
			things.add("Thing" + i);
		}
		if(things.size() == 0) {
			System.out.println("List is empty!");
		} else {
			System.out.println("List is not empty!");
		}
	}
}
