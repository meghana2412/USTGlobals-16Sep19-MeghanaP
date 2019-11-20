package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {

		ArrayList<Marker> al = new ArrayList<Marker>();

		al.add(new Marker(50,"blue"));
		al.add(new Marker(60,"red"));
		al.add(new Marker(45,"green"));
		al.add(new Marker(30,"black"));

		System.out.println("Before sorting-------------->");
		display(al);

//		SortByPrice sb = new SortByPrice();
//		display(al);


//		SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();


//		Collections.sort(al, sb);
		Collections.sort(al,sc);
		System.out.println("after sorting ------------->");

		display(al);


	}

	private static void display(ArrayList<Marker> al) {
		Iterator<Marker> it = al.iterator();
		while(it.hasNext())
		{
			Marker m = it.next();
			System.out.println("Price is : "+m.price);
			System.out.println("Color is : "+m.color);
			System.out.println("***************************");
		}
	}
}
