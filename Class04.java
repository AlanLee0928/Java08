class CBox{
	int length , width , height;
}

public class Class04 {
	public static void main(String[] args) {
		CBox Box;
		Box = new CBox();
		Box.length = 15;
		Box.width = 10;
		Box.height = 25;
		System.out.println("length= "+Box.length);
		System.out.println("width="+Box.width);
		System.out.println("height="+Box.height);
	}
}