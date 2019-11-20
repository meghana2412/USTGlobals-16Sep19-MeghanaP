
public class TestF {
	public static void main(String[] args) {
		Student.cname = "JSpider";
		Student s1 = new Student();
		s1.name = "Megha";
		s1.usn = 20;
		System.out.println("college name is : "+Student.cname);
		System.out.println("name is : "+s1.name);
		System.out.println("usn is : "+s1.usn);
		
		System.out.println("*********************************");
		
		
		Student s2 = new Student();
		s2.name = "Pavan";
		s2.usn = 62;
		System.out.println("college name is : "+Student.cname);
		System.out.println("name is : "+s2.name);
		System.out.println("usn is : "+s2.usn);
	}
}
