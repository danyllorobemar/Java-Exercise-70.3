package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		double g1, g2, g3;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the student's name:");
		student.name = sc.nextLine();
		System.out.println("Enter the grade 1");
		do {
			g1 = sc.nextDouble();
			if(g1 >= 0 && g1 <=30) {
				student.grade1 = g1;
			}else {
				System.out.println("Invalid grade!");
				System.out.println("Enter a grade from 0 to 30: ");
			}
		}while(g1 < 0 || g1 > 30);
		System.out.println("Enter the grade 2");
		do {
			g2 = sc.nextDouble();
			if(g2 >= 0 && g2 <=35) {
				student.grade2 = g2;
			}else {
				System.out.println("Invalid grade!");
				System.out.println("Enter a grade from 0 to 35: ");
			}
		}while(g2 < 0 || g2 > 35);
		System.out.println("Enter the grade 3");
		do {
			g3 = sc.nextDouble();
			if(g3 >= 0 && g3 <=35) {
				student.grade3 = g3;
			}else {
				System.out.println("Invalid grade!");
				System.out.println("Enter a grade from 0 to 35: ");
			}
		}while(g3 < 0 || g3 > 35);
		
		student.result(student.average(student.grade1,student.grade2,student.grade3));
		
		sc.close();

	}

}
