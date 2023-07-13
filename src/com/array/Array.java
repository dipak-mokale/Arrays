package com.array;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(20);
		arrayList.add("Deepak");
		
		System.out.println(arrayList);
		arrayList.remove("Deepak");
		System.out.println(arrayList);
	}

}
