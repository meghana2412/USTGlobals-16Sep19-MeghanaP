
public class Bus {
  int seat;
  String color;
  
  Bus(String color,int seat)
  {
	  this.color = color;
	  this.seat = seat;
  }
  
  Bus()
  {
	  this(40);
  }
  
  Bus(int seat)
  {
	  this("red",seat);
  }
   void getDetails()
   {
	   System.out.println("seat color : "+color+" .seat no is: "+seat);
   }
}
