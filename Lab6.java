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
		
		
		System.out.print("Enter the # of Practice Problem assignments you have submitted: "); //Retrieving # of practice problem assignments user has submitted
		int nOfPP = userInput.nextInt();
		int[] pracProbs = new int[nOfPP];
		
		
		for(int i=0; i<nOfPP; i++) {
			System.out.print("Practice Problems #" + (i+1) + " Grade: "); //Retrieving grade of each practice problem assignment user submitted & storing into an array 
			pracProbs[i] = userInput.nextInt();
			currentGrade = currentGrade + pracProbs[i];
		}
		
		
		System.out.print("\nEnter the # of Labs you have submitted so far: "); //Retrieving # of labs user has submitted
		int nOfLabs = userInput.nextInt();
		int[] labs = new int[nOfLabs];
		
		
		for(int y=0; y<nOfLabs; y++) {
			System.out.print("Lab #" + (y+1) + " Grade: "); //Retrieving grade of each lab user submitted & storing into an array
			labs[y] = userInput.nextInt();
			currentGrade = currentGrade + labs[y];
		}
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println("\nEnter your grades for midterm #1 and midterm #2"); //Retrieving grade of both mid terms & storing into an array
		System.out.print("Midterm #1: ");
		midTerms[0] = userInput.nextDouble();
		System.out.print("Midterm #2: ");
		midTerms[1] = userInput.nextDouble();
		currentGrade = currentGrade + midTerms[0] + midTerms[1];
		totalGrade = (int)((currentGrade/currentPossiblePoints)*100); //Calculating current grade in class in comparison to total number of possible points currently
		
		if(totalGrade >= 90) {letterGrade = 'A';}
		else if(totalGrade >= 80 && totalGrade < 90) {letterGrade = 'B';}
		else if(totalGrade >= 70 && totalGrade < 80) {letterGrade = 'C';} //Determining letter grade of current grade 
		else if(totalGrade >= 60 && totalGrade < 70) {letterGrade = 'D';}
		else {letterGrade = 'F';}
		
		System.out.print("\nCurrent numeric Grade: " + (df.format(totalGrade))); //Printing current numeric grade
		System.out.print("\nCurrent letter Grade: " + letterGrade); //Printing current letter grade
		
		
		currentGrade = currentGrade + 4 + 12 + 20; //2 Labs remaining = 4 total points, 2 Practice Problems remaining = 12 total points, 1 final exam = 20 total points
		totalGrade = (int)((currentGrade/totalPoints)*100); //Calculating highest possible grade based on current scores + receiving full points for remaining assignments
		if(totalGrade >= 90) {letterGrade = 'A';}
		else if(totalGrade >= 80 && totalGrade < 90) {letterGrade = 'B';}
		else if(totalGrade >= 70 && totalGrade < 80) {letterGrade = 'C';} //Converting highest possible numeric grade to letter grade
		else if(totalGrade >= 60 && totalGrade < 70) {letterGrade = 'D';}
		else {letterGrade = 'F';}
		
		
		System.out.print("\n\nHighest possible numeric grade given current scores: " + df.format(totalGrade)); //Printing highest possible numeric grade based on current scores
		System.out.print("\nHighest possible Letter grade given current scores: " + letterGrade); //Printing highest possible letter grade based on current scores
	}
}