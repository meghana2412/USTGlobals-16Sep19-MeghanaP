
public class Employee1 {

	String name;
	int eid;
	
	public Employee1(String name, int eid)
	{
		this.name = name;
		this.eid = eid;
		this.printDetails();
	}
	
	void printDetails()
	{
		System.out.println("Employee name is: "+this.name);
		System.out.println("Employee id is : "+this.eid);
		this.sayHello();
	}
	
	void sayHello()
	{
		System.out.println("Hello "+name+" Welcome to UST global company");
	}
	public static void main(String[] args)
	{
     Employee1 e1 = new Employee1("Megha", 20);
//      e1.printDetails();
          
     Employee1 e2 = new Employee1("Pavan", 30);
//     e2.printDetails();
     
     Employee1 e3 = new Employee1("Nischith", 40);
//     e3.printDetails();
     
    
     
	}
}


