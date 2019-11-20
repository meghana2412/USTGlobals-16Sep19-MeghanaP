
public class Employee2
{
	String name;
	int eid;
	long aadarno;
	
	Employee2(String name,int eid,long aadarno)
	{
		this.name = name;
		this.eid = eid;
		this.aadarno = aadarno;
	}
	
	Employee2(String name,int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	
	Employee2(int eid,String name)
	{
		this.name = name;
		this.eid = eid;
	}
	
	void displayEmpDetails()
	{
		System.out.println("hai "+name+" welcome");

		System.out.println("Employee name is : "+name);
		System.out.println("Employee eid is : "+eid);
		System.out.println("Employee aadarno is : "+aadarno+"\n");
	}
	
}
