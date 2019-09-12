package com.manoj;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List al1 = new ArrayList();
		al1.add("Manoj");
		al1.add("Kumar");
		al1.add("Sharma");
		System.out.println("List 1 : "+al1);
		List al2 = new ArrayList();
		al2.add(1111);
		al2.add(2222);
		al2.add(3333);
		System.out.println("List 2 :"+al2);
		al1.add(al2);
		System.out.println("Mix List :"+al1);
		al1.contains(al2);
		System.out.println(al1);
		al1.add(3, "Mumabi");
		al1.add(4, "CG");
		System.out.println(al1);
		

	}

}
