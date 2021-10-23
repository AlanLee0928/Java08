class Cddd{
	String name;
	double height , weight;
}

public class Class03 {
	public static void main(String[] args) {
		Cddd student = new Cddd();
		student.name = "Sandy";
		student.height = 165.5;
		student.weight = 58.2;
		double BMI = student.weight / (student.height * 0.01 * student.height * 0.01);
		System.out.println(student.name);
		System.out.println(student.height);
		System.out.println(student.weight);
		System.out.println(BMI);
	}
}