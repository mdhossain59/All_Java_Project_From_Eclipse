package com.ct;
import java.util.Scanner;
public class For_loop {

	public static void main(String[] args) {
		System.out.println(" hi, java how are you?");
		System.out.println(" I am learning you very soon.");
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter a number");
		int result;
		result = scan.nextInt();
		System.out.println(" You enetered " +result);
		
		for (int i = 0; i< result;  i++) {
			
		int	result1 = result+i;
			
			System.out.println(" the value of result is:" +result1);
		}

	}

}
