import java.util.Scanner;
import java.io.*;

public class UserInput {

	double[] numbers = new double[2]; 
	Scanner scan = new Scanner(System.in); 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public char insertOperator() {
		System.out.println("\nEnter + for Addition: ");
		System.out.println("Enter - for Subtraction: ");
		System.out.println("Enter * for Multiplication: ");
		System.out.println("Enter / for Division: ");
		System.out.println("Enter @ for Array Operation: ");

		char operator = scan.next().charAt(0);

		return operator;
	}

	public double[] insertNumbers() {
	
		System.out.println("Enter First Number: ");
		numbers[0] = scan.nextDouble();
		

		System.out.println("Enter Second Number: ");
		numbers[1] = scan.nextDouble();
		

		return numbers;
	}
	

	public double[] insertArray() throws IOException {

		System.out.println("Enter Total Numbers to Enter: ");
		int size_of_array = scan.nextInt();
		
	
		System.out.println("Enter " + size_of_array + " Numbers: ");
		double[] numbers = new double[size_of_array];
		
		String array = br.readLine();
		
	
		String[] array_numbers = array.trim().split("\\s+");
		
		for (int i = 0; i < size_of_array; i++) {
			numbers[i] = Double.parseDouble(array_numbers[i]);
		}
		
		return numbers;
	}
}
