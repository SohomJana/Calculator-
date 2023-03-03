public class Calculator {
	

	public double[] performAddition(double[] numbers) {
		 
		double[] result = new double[2];
	
		result[0] = numbers[0] + numbers[1];
		
			return result;
	}
	
	public double[] performSubtraction(double[] numbers){
		 
		double[] result = new double[2];
		
		result[0] = numbers[0] - numbers[1];
		
		
		return result;
	}

	public double[] performMultiplication(double[] numbers){
 
		double[] result = new double[2];

		result[0] = numbers[0] * numbers[1];

		return result;
	}

	public double[] performDivision(double[] numbers){
  
		double[] result = new double[2];

		result[0] = numbers[0] / numbers[1];

		return result;
	}

	public double[] performArrayOperations(double[] numbers){

		double[] result = new double[5];
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double mean = sum/numbers.length;
		double squaredSumDifference = 0;
		for (int i = 0; i < numbers.length; i++) {
			double diff = numbers[i] - mean;
			squaredSumDifference += diff * diff;
		}

		double variance = squaredSumDifference / numbers.length;
		double deviation = Math.sqrt(variance);

		result[0] = sum;
		result[1] = mean;
		result[2] = deviation;

		return result;

	}
	
}
