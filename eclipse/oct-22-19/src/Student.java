
public class Student {
   String name;
   long phno;
   int usn;
   String branch;
   double cgpa;
   
      Student(String name, long phno, int usn, String branch, double cgpa)
      {
    	  this.name = name;
    	  this.phno = phno;
    	  this.usn = usn;
    	  this.branch = branch;
    	  this.cgpa = cgpa;
    	  this.displayDetails();
      }
      
      void displayDetails()
      {
    	  System.out.println("student name is : "+name);
    	  System.out.println("student phno is : "+phno);
    	  System.out.println("student usn is : "+usn);
    	  System.out.println("student branch is : "+branch);
    	  System.out.println("student cgpa is : "+cgpa+"\n");
      }
      public static void main(String[] args) {
		Student s1 =  new Student("Meghana",948335280,1,"EEE",6.8);
		
		Student s2 =  new Student("Pavan",984504612,2,"CSE",7.3);
		
		Student s3 =  new Student("Nischith",948485280,3,"CSE",6.4);
		
		Student s4 =  new Student("Sanmathi",728335280,4,"ECE",8.3);
		
		Student s5 =  new Student("Ramesha",923528032,5,"EE",9.3);
		
		Student s6 =  new Student("Vivek",743335280,6,"CIV",6.8);
		
		Student s7 =  new Student("Kavya",948334580,7,"EEE",6);
		
		Student s8 =  new Student("Pooja",739273320,8,"MECH",5.8);
		
		Student s9 =  new Student("Suma",94833580,9,"ECE",6.5);
		
		Student s10 =  new Student("Chaithra",435895280,10,"EEE",6.9);
	}
      
}
