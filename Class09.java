class CCalculator{
	int a , b , c;
	
	void set_value(int x ,int y ,int z) {
		a = x;
		b = y;
		c = z;
	}
	
	void show() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.add());
		System.out.println(this.sub());
		System.out.println(this.mul());
		System.out.println(this.avg());
	}
	
	int add() {
		return a + b + c;
	}
	
	int sub() {
		return a - b - c;
	}
	
	int mul() {
		return a * b * c;
	}
	
	double avg() {
		return (a + b + c) / 3;
	}
}

public class Class09 {
	public static void main(String[] args) {
		CCalculator obj = new CCalculator();
		obj.set_value(25, 3, 7);;
		obj.show();
	}
}