package Java08;
class Ctest{
	int a , b , c;
	
	void test() {
		if(a == 0) {
			System.out.println("���Ƭ�0");
		}
		else if(a > 0) {
			System.out.println("���Ƭ�����");
		}
		else{
			System.out.println("���Ƭ��t��");
		}
		
		if(b == 0) {
			System.out.println("���Ƭ�0");
		}
		else if(b > 0) {
			System.out.println("���Ƭ�����");
		}
		else{
			System.out.println("���Ƭ��t��");
		}
		
		if(c == 0) {
			System.out.println("���Ƭ�0");
		}
		else if(c > 0) {
			System.out.println("���Ƭ�����");
		}
		else{
			System.out.println("���Ƭ��t��");
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