package studio1;

import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("The first of two integers to be average?");
		int n1 = reader.nextInt();
		int n2 = reader.nextInt();
		System.out.println("Average of " + n1 + " and " + n2 + " is " + (double)(n1+n2)/2);
		
	}

}
