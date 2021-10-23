package Java05;

class Cbox{
	int length , width , height;
	
	void showAll(){
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		System.out.println(this.volume());
		System.out.println(this.surfaceArea());
	}
	int volume(){
		return length * width * height;
	}
	
	int surfaceArea(){
		return length * width * 2 + width * height * 2 + length * height * 2;
	}
	
	void showData(){
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
	}
	
}

public class Class05 {
	public static void main(String[] args) {
		Cbox box = new Cbox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showAll();
	}
}