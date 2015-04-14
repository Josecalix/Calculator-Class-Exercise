
   public class CalculatorDriver {

	public static void main(String[] args) {

		double [] number = new double [4];
		
		number[0]= 1.1;
		number[1]= 2.2;
		number[2]= 3.3;
		number[3]= 4.4;
		
		int [] number2 = new int [2];
		
		number2[0]= 7;
		number2[1]= 10;
		
	System.out.println(Calculator.getSum(1.1, 2.2, 3.3, 4.4));
	System.out.println(Calculator.getSum(number));
	System.out.println(Calculator.getAverage(1.1, 2.2, 3.3, 4.4));
	System.out.println(Calculator.getAverage(number));
	System.out.println(Calculator.getProduct(7,10));
	System.out.println(Calculator.getProduct(number2));
	System.out.println(Calculator.getFactorial(7));
	System.out.println(Calculator.getFactorial(number2));
	
	}

  }
