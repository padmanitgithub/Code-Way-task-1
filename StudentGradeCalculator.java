package test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentGradeCalculator{
	public static void main(String[] args) {
		float score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student name:");
		String name=sc.nextLine();
		try(sc) {
			int marks[]=new int[8];//Assuming 7 Subjects
			for(int i=1;i<marks.length;i++) {
				System.out.println("Subject "+i+" Marks:");
				marks[i]=sc.nextInt();
				if(marks[i]>100) {
					System.out.println("marks must be between 1-100");
					break;
				}else {
				score+=marks[i];
			}
			}
			if(score>0.0) {
				System.out.println("Student Name:"+name);
				System.out.println("Student total marks:"+score);
			System.out.println("Student Score:"+score/7);
			score=score/7;
			if(score>=90.0) {
				System.out.println("Student grade is:"+"S");	
			}else if(score>=80.0 ) {
				System.out.println("Student grade is:"+"A");
			}else if(score>=70.0) {
				System.out.println("Student grade is:"+"B");
			}else if(score>=60.0){
				System.out.println("Student grade is:"+"C");
			}else if(score>=50) {
				System.out.println("Student grade is :D");
			}else {
				System.out.println("Student grade is :Fail");
			}
			}
			}
		catch(InputMismatchException e) {
			System.out.println("Marks should be in numbers");
		}
	}
}
