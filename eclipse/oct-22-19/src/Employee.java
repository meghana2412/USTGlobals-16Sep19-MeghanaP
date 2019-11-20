
public class Employee {
	String name;
	int eid;
	
	public Employee(String empname, int empid)
	{
		name = empname;
		eid = empid;
	}
	
	void printDetails()
	{
		System.out.println("Employee name is: "+name);
		System.out.println("Employee id is : "+eid);
	}
	public static void main(String[] args)
	{
     Employee e1 = new Employee("Megha", 20);
      e1.printDetails();
          
     Employee e2 = new Employee("Sanmathi", 30);
     e2.printDetails();
     
     Employee e3 = new Employee("Sachin", 40);
     e3.printDetails();
     
    
     
	}
}
