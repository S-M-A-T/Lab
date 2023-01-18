package lab2scd;
import java.util.Scanner;
public class Marksheet {
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student name: ");
		String stu_Name=sc.next();
		
		
		System.out.println("Enter no of subjects: ");
		int courses=sc.nextInt();
		int sumObt=0;
		int[] obtNo=new int[courses];
		
		int b=2;  //changes 
		for (int i=0;i<courses;i++) {
			
			System.out.println("Enter obtained marks in course:"+b);
			int obt=sc.nextInt();
			obtNo[i]=obt;
			b++;
			
			sumObt+=obtNo[i];
		}
		int total=courses*100;
		float per=sumObt*100/total;
		
		String grade;
		if(per>90) {
			grade="A+";
			}
		else if(per<90 && per>70) {
			grade="A";
		}
		else if(per<70 && per>60) {
			grade="B";
		}
		else {
			grade = "C";
		}
		
		int GPA=0;
		switch(grade) {
		case "A+":
			GPA=4;
			break;
		case "A":
			GPA=3;
			break;
		case "B":
			GPA=2;
			break;
		case "C":
			GPA=1;
			break;
			
		}
		
		System.out.println("\t***MARKSHEET**\t");
		System.out.println("STUDENT NAME   = "+ stu_Name);
		System.out.println("Total Subjects = "+ courses);
		System.out.println("Total Marks    = "+ total);
		System.out.println("Obtained Marks = "+ sumObt);
		System.out.println("Percentage     = "+per);
		System.out.println("Grade          = "+grade);
		System.out.println("GPA            = "+GPA);
	
	}
}
