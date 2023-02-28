
/**
 * 
 * @author Lorenzo Noel Menor 
 * SAMPLE PROGRAM; ITCS123 Review EDITION
 * haha kunwari official magaling si gago ;^)
 */

import java.util.Scanner;

public class ITCS123ReviewEDITION {
	public static void main(String[] args) {
		// This file is explanation of the program done on ITCS123 Lecture 3rd Week ata.
		// Go ahead and either copy paste this to your local IDE or download this file.
		System.out.println(
				"Programmed by:\nLorenzo Noel Menor \nJoriz Ybardolaza \nRitz Sarangaya \nNathan Anico \nFranco Garcia\n\n");

		// remove the double slash on both or either program for them to start.
		// programOne();

		System.out.println("\n\n");

		// programTwo();

	}

	public static void programOne() {

		// Initialize the scanner for user input
		Scanner scan = new Scanner(System.in);
		// Initialize the variable that will store our final output.
		int sum;
		System.out.print("Input an integer: ");
		int a = scan.nextInt();
		// We are doing sum = a to create a starting point where the following
		// numbers will be added
		sum = a;

		// If-Else statement to make sure we have only the acceptable values of 1 - 10
		if (a < 11 && a > 0) {
			// Wrote this so the first number can receive a plus sign when printing
			System.out.print(a + " + ");

			// Since we know the fixed max we used i < 10 as our condition.
			for (int i = a; i < 10; i++) {
				a += 1;
				// This was made so the last digit did not receive a plus sign after it.
				if (i < 9) {
					System.out.print(a + " + ");
				} else {
					System.out.print(a);
				}

				// Add the amount to the number i.e. 3+4, 4+5, so on and so forth.
				sum += a;

			}
			// Print the output.
			System.out.println(" = " + sum);
		} else {
			// bomba
			System.out.print("Entered number is out of range");
		}

	}

	public static void programTwo() {

		// Initialize chu chu
		Scanner scan = new Scanner(System.in);

		// We need a pointer to store the current value and be compared to the value
		// presented
		// by the loop
		int pointer;
		// I created an array to store the three values so we can easily access it
		// after.
		int values[] = new int[3];
		System.out.print("Enter the First Integer: ");
		values[0] = scan.nextInt();
		System.out.print("\nEnter the Second Integer: ");
		values[1] = scan.nextInt();
		System.out.print("\nEnter the Third Integer: ");
		values[2] = scan.nextInt();

		// Only did this so output can start comparing immediately with a value in the
		// array.
		// If I changed it to be equal to zero it would be the same.
		int output = values[0];

		// This is to check if all values are under or equal to 10
		// If I wanted to do more work I would also cover the negative values kaso
		// tinamad ako
		if (values[0] <= 10 && values[1] <= 10 && values[2] <= 10) {

			// The for loop goes and checks for each value.
			for (int i = 0; i < 3; i++) {
				// pointer begins at values[0]
				pointer = values[i];
				// If the output is less than values, change the output value.
				// essentially replacing the output if it can get bigger lol.
				if (output < values[i]) {
					output = pointer;
				}

			}
			// Print the output
			System.out.println("The highest number is " + output);
		} else {
			//Entered number chuchu
			System.out.print("Entered number/s is out of range");

		}

	}

}
