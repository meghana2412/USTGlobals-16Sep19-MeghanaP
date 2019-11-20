
public class TestE {
public static void main(String[] args) {
	Btr b = new Btr();
	b.swipe();
	int count = b.getCount();
	System.out.println(count);
	
	int totalCount = b.getTotalCount();
	System.out.println(totalCount);
	
	System.out.println("count of btr : "+ b.count);
	System.out.println("******************************");
	
	Btr b1 = new Btr();
	b1.swipe();
	
	int count1 = b1.getCount();
	System.out.println(count);
	
	int totalCount1 = b1.getTotalCount();
	System.out.println(totalCount);
	
	System.out.println("total count: "+b1.totalCount);
}
}
