class CTest{
	int a , b , c;
	
	void Test() {
		if(a == 0) {
			System.out.println("���Ƭ�0");
		}
		else if(a % 2 == 0) {
			System.out.println("���Ƭ�����");
		}
		else{
			System.out.println("���Ƭ��_��");
		}
		
		if(b == 0) {
			System.out.println("���Ƭ�0");
		}
		else if(b % 2 == 0) {
			System.out.println("���Ƭ�����");
		}
		else{
			System.out.println("���Ƭ��_��");
		}
		
		if(c == 0) {
			System.out.println("���Ƭ�0");
		}
		else if(c % 2 == 0) {
			System.out.println("���Ƭ�����");
		}
		else{
			System.out.println("���Ƭ��_��");
		}
	}
}

public class Class07 {
	public static void main(String[] args) {
		CTest Test = new CTest();
		Test.a = 3;
		Test.b = 8;
		Test.c = 0;
		Test.Test();
	}
}