
public class TestH {
public static void main(String[] args) {
	FirstGen fg = new FirstGen();
	fg.msg();
	fg.call();
	
	System.out.println("***************");
	
	SecondGen sg = new SecondGen();
	sg.call();
	sg.games();
	sg.msg();
	
	System.out.println("******************");
	
	ThirdGen tg = new ThirdGen();
	tg.games();
	tg.camera();
	tg.msg();
	tg.call();
}
}
