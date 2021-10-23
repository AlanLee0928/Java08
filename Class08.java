package Java08;
class Ctest{
	int a , b , c;
	
	void test() {
		if(a == 0) {
			System.out.println("计0");
		}
		else if(a > 0) {
			System.out.println("计タ计");
		}
		else{
			System.out.println("计璽计");
		}
		
		if(b == 0) {
			System.out.println("计0");
		}
		else if(b > 0) {
			System.out.println("计タ计");
		}
		else{
			System.out.println("计璽计");
		}
		
		if(c == 0) {
			System.out.println("计0");
		}
		else if(c > 0) {
			System.out.println("计タ计");
		}
		else{
			System.out.println("计璽计");
		}
	}
}

public class Class08 {
	public static void main(String[] args) {
		Ctest test = new Ctest();
		test.a = -4;
		test.b = 8;
		test.c = 0;
		test.test();
	}
}