class CWin{
	int width;
	int height;
	String name;
	
	void setW(int w) {
		width=w;
	}
	
	void setH(int h) {
		height=h;
	}
	
	void setName(String s) {
		name=s;
	}
	
	public void show() {
		System.out.println("Name="+name);
		System.out.println("w="+width+", H="+height);
	}
	
	void setWindows(int w,int h) {
		this.width=w;
		this.height=h;
	}
	
	void setWindows(int w,int h,String s) {
		this.width=w;
		this.height=h;
		this.name=s;
	}
}

public class Class12 {
	public static void main(String[] args) {
		CWin cw = new CWin();
		cw.setName("My Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}
}