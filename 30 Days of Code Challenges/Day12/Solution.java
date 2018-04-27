import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] score) {
		super(firstName, lastName, id);
		this.testScores = score;
	}

	public char calculate() {
		int sum = 0;
		for (int score : testScores) {
			sum += score;
		}
		float avg = sum / testScores.length;
		
		return ( avg > 89 ? 'O' : 
	         avg > 79 ? 'E' : 
	         avg > 69 ? 'A' : 
	         avg > 54 ? 'P' :
	         avg > 39 ? 'D' : 'T' );
	}

}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}