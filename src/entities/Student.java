package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double average(double g1, double g2, double g3) {
		return g1 + g2 + g3;
	}
	
	public void result(double average) {
		if (average >= 60){
			System.out.printf("Final grade = %.2f%n", average);
			System.out.println("Pass");
		}else {
			System.out.printf("Final grade = %.2f%n", average);
			System.out.println("Failed");
			System.out.printf("Missing %2f points",60-average);
		}
	}
	

}
