 
   
   public class Calculator {
	
	 public static double getSum( double number1, double number2, double number3, double number4){
		return (number1 + number2 + number3 + number4);
	 }
	
	 public static double getAverage(double number1, double number2, double number3, double number4){
		return ((number1 + number2 + number3 + number4)/4.0);
	 }
	
	 public static double getProduct( int number1, int number2){
		
		return (number1*number2);
	 }
	  
         public static int getFactorial( int number3){
		
		int fact = 1;
		for ( int j = 1 ; j <= number3 ; j ++ ){
            fact = fact*j;
	 }
		return fact;
	 }

	 public static double getSum(double [] number) {
		
		double sum = 0.0;
		for ( int start = 0; start < number.length; start ++){
				sum += number[start];
		}		
		return (sum);
	 }	
	
	 public static double getAverage( double [] number ) {
		
		double sum = 0.0;
		for (int begin = 0; begin < number.length; begin ++){
			sum += number[begin];
	 }

		return (sum/(number.length));
	 }

	 public static int getProduct ( int [] number2){
		
		int multiply = number2[0]*number2[1];
		return multiply;			
	 }
	
	 public static int getFactorial( int [] number2){
		
		int factorial = 1;
		for ( int j = 1 ; j <= number2[0] ; j ++ ){
            factorial = factorial*j;
	 }
		return factorial;
	 }
		
	
    }