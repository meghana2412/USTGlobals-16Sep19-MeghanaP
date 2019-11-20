package com.ustglobal.lambaexpressions;

public class TestSquare {

	public static void main(String[] args) {
		
		SquareInterface square1 = x -> x*x;
		int sqrnum = square1.square(3);
		System.out.println(sqrnum);
		
	}
}
