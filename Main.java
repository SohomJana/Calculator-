import java.util.Scanner;
import java.io.*;

public class Main {
  
    static double[] numbers;
    static double[] result;

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        System.out.println("Enter Operator for Operation: ");

        char operator = userInput.insertOperator();

        switch (operator) {
     
            case '+':
                numbers = userInput.insertNumbers();
                result = calculator.performAddition(numbers); 
                System.out.println("Sum is " + result[0]); 
                break;

            case '-':
                numbers = userInput.insertNumbers();
                result = calculator.performSubtraction(numbers);
                System.out.println("Subtraction is " + result[0]);
                break;

            case '*':
                numbers = userInput.insertNumbers();
                result = calculator.performMultiplication(numbers);
                System.out.println("Multiplication is " + result[0]);
                break;

            case '/':
                numbers = userInput.insertNumbers();
                result = calculator.performDivision(numbers);
                System.out.println("Division is " + result[0]);
                break;

            case '@':
				try {
					numbers = userInput.insertArray();
					result = calculator.performArrayOperations(numbers);

					System.out.print("Addition of Array is: "+result[0]);
					System.out.print("\nMean of Array is: "+result[1]);
					System.out.print("\nStandard Deviation of Array is: "+result[2]);
				} 
				catch(IOException e) {
                	System.out.println("Invalid array input: " + e.getMessage());
				}
				
		}
	}
}
