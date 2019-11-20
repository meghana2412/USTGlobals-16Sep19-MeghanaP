package com.ustglobal.google;

public class TestA {

	public static void main(String[] args) {
		Browser b = new Browser();
		Google g = new GoogleDrive();
		Google gm = new Gmail();
		b.open(g);
		b.open(gm);
		
	}
}
