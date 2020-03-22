package JavaLearningExercise;

import java.util.Scanner;
/**
 * 
 * @author mdhossain
 *
 */

public class Convert_Integer_to_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		String.valueOf(num);
		System.out.println(" the number is "+num);

	}

}
