package com.ustglobal.studentapp.qspider;
//import com.ustglobal.studentapp.jspider.Angular;
//import com.ustglobal.studentapp.jspider.React;

import com.ustglobal.studentapp.jspider.*;

public class TestA {


	public static void main(String[] args) {
		QTP q = new QTP();
		q.techQtp();

		Selenium s =new Selenium();
		s.techSelenium();

		//		com.ustglobal.studentapp.jspider.Angular a = new com.ustglobal.studentapp.jspider.Angular();
		//		
		//		com.ustglobal.studentapp.jspider.Angular b = new com.ustglobal.studentapp.jspider.Angular();
		//

		Angular a = new Angular();
		a.techAngular();
		
		React r = new React();
		r.techReact();
	}

}
