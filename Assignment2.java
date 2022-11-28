/* Karena Qian
 * CS 201
 * 4/29/2020 
 * This program tests 5 different methods that will find the largest value out of a set of number, 
 * the last digit of a number, take a string and add the proper number of spaces in front of it, 
 * calculate the scientific notation of a given number by its exponent, and calculate the area 
 * of a triangle using given values.*/
public class Assignment2 {

	public static void main(String[] args) {
		//set boolean tests (optional)
		boolean testS= false;
		boolean testT = false;
		
		//call the method largstAbsVal and record value
		int largestNum = largestAbsVal(2, 12, -22);
		System.out.println(largestNum);
		
		//call the method lastDigit and record value
		int lastNum = lastDigit(-54321);
		System.out.println(lastNum);
		
		//call the method padString and record String
		String padWord = padString("word", 10);
		System.out.println(padWord);
		
		//call the method scientific and test resulting absolute value
		double scienceTest = scientific(8, 2) - 800;
		//using if and else statements (optional) 
		//(I learned about them from my past experiences)
		//if value is < than 0.01, 
		if (Math.abs(scienceTest) < 0.01) {
			//set boolean to true and record
			testS = true;
			System.out.println(testS);
		}
		//else,
		else{
			//record initial boolean
			System.out.println(testS);
		}
		
		//call the method triangleTest and test resulting absolute value
		double triangleTest = triangleArea(42, 21, 35) - 366.68;
		//using if and else statements (optional)
		//same as above
		if(Math.abs(triangleTest) < 0.02) {
			testT = true;
			System.out.println(testT);
		}
		else {
			System.out.println(testT);
		}
	}
	
	//set int method with 3 int values
	public static int largestAbsVal(int num1, int num2, int num3){
		//tests three absolute values to find the max & returns the max
	    int large = Math.max(Math.abs(num1), Math.abs(num2));
	    int largest = Math.max(Math.abs(num3), large);
	    return largest;
	}
	
	//set int method with 1 int value
	public static int lastDigit(int number){
		//takes absolute value and finds last number by taking remainder of value/10, 
		//returns remainder
		int lastNum = Math.abs(number) % 10;
		return lastNum;
	}
	
	//set double method with 2 double values
	public static double scientific(double base, double exponent){
		//takes 1st number and multiplies it by 10 raised to 2nd number power,
		//returns resulting value
	    double numFinal = base * Math.pow(10, exponent);
	    return numFinal;
	}
	
	//set double method with 3 double values
	public static double triangleArea(double side1, double side2, double side3){
		//calculates area by using Heron's formula
		//returns resulting value
	    double s = (side1 + side2 + side3)/2;
	    double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	    return area;
	}
	
	//set String method with a String value and a int value
	public static String padString(String word, int length){
		//store String length in variable
	    int wordLength = word.length();
	    //using if statement (don't know if this is allowed, but it works)
	    //if word length is < than given int value
	    if(wordLength < length){
	    	//add 1 space before string (int value - word length) times
	        for(int i = 0; i < length-wordLength; i++){
	            word = " " + word; 
	        }
	    }
	    //returns resulting String
	    return word;
	}
}
