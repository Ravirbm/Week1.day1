package week1.day1;

public class OddNumbers {

	public static void main(String[] args) {
		/*
		 * Goal: Find the odd numbers in the specific range of numbers
		 * 
		 * Input: range of numbers (starting to end) [1 to 20]
		 * Output: Printing only odd numbers [1,3,5,7,9...,19]
		 * 
		 * 
		 */
		
		//create for loop and use mod operator to separate odd numbers
		int a;
		for(int i = 1; i<=20; i++) {
			a = i % 2;
			if (a!=0)
			System.out.println(i);
		}

	}

}
