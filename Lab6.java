import java.text.DecimalFormat;
import java.util.*;
public class Lab6 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		double[] midTerms = new double[2];
		double currentGrade = 0;
		double totalGrade = 0;
		double totalPoints = 100;
		double currentPossiblePoints = 61;
		char letterGrade = 'X';
		
		
		System.out.print("Enter the # of Practice Problem assignments you have submitted: ");
		int nOfPP = userInput.nextInt();
		int[] pracProbs = new int[nOfPP];
		
		
		for(int i=0; i<nOfPP; i++) {
			System.out.print("Practice Problems #" + (i+1) + " Grade: ");
			pracProbs[i] = userInput.nextInt();
			currentGrade = currentGrade + pracProbs[i];
		}
		
		
		System.out.print("\nEnter the # of Labs you have submitted so far: ");
		int nOfLabs = userInput.nextInt();
		int[] labs = new int[nOfLabs];
		for(int y=0; y<nOfLabs; y++) {
			System.out.print("Lab #" + (y+1) + " Grade: ");
			labs[y] = userInput.nextInt();
			currentGrade = currentGrade + labs[y];
		}
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println("\nEnter your grades for Midterm #1 and Midterm #2");
		System.out.print("Midterm #1: ");
		midTerms[0] = userInput.nextDouble();
		System.out.print("Midterm #2: ");
		midTerms[1] = userInput.nextDouble();
		currentGrade = currentGrade + midTerms[0] + midTerms[1];
		totalGrade = (int)((currentGrade/currentPossiblePoints)*100);
		
		if(totalGrade >= 90) {letterGrade = 'A';}
		else if(totalGrade >= 80 && totalGrade < 90) {letterGrade = 'B';}
		else if(totalGrade >= 70 && totalGrade < 80) {letterGrade = 'C';}
		else if(totalGrade >= 60 && totalGrade < 70) {letterGrade = 'D';}
		else {letterGrade = 'F';}
		
		System.out.print("\nCurrent Numeric Grade: " + (df.format(totalGrade)));
		System.out.print("\nCurrent Letter Grade: " + letterGrade);
		
		currentGrade = currentGrade + 4 + 12 + 20; //2 Labs remaining = 4 total points, 2 Practice Problems remaining = 12 total points, 1 final exam = 20 total points
		totalGrade = (int)((currentGrade/totalPoints)*100);
		if(totalGrade >= 90) {letterGrade = 'A';}
		else if(totalGrade >= 80 && totalGrade < 90) {letterGrade = 'B';}
		else if(totalGrade >= 70 && totalGrade < 80) {letterGrade = 'C';}
		else if(totalGrade >= 60 && totalGrade < 70) {letterGrade = 'D';}
		else {letterGrade = 'F';}
		System.out.print("\n\nHighest Possible Numeric Grade given current scores: " + df.format(totalGrade));
		System.out.print("\nHighest possible Letter Grade given current scores: " + letterGrade);
		
	}

}
