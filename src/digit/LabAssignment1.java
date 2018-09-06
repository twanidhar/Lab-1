package digit;
import java.util.Scanner;

public class LabAssignment1 {

	public static void main(String[] args) {
		/*Input: Your program should read two integer numbers from the user with 
		 * the same number of digits (example: number1= 234, number2 = 564).
		 *Task: Check if each corresponding place
		 in the two numbers (ones, tens, hundreds, ...) sums to the same total.
		Output: Your program should print out: True or False based on the result.*/
		//this program will only work for three digit numbers
		
		Scanner number = new Scanner (System.in);
		//create a string to obtain 2 integer numbers
		System.out.println("Enter a 3 digit number");
		//user enter a number
		int number1 = number.nextInt();
		//defining variables to get place values for number1
		int hundreds1= (number1/100)%10;
		int tens1 = (number1/10)%10;
		int ones1 = number1% 10;
		System.out.println("Enter another 3 digit number");//user enter another 3 digit number
		int number2 =number.nextInt();
		int sumOfnumbers =0;
		sumOfnumbers = number2 + number1; //check to see if the numbers add to the same numbers.
		 
		// defining variables to get place values for number2
		int hundreds2= (number2/100)%10;
		int tens2 = (number2/10)%10;
		int ones2 = number2%10;
		int sumOfOnes= ones1 + ones2;
		int sumOftens= tens1 + tens2;
		int sumOfhundreds= hundreds1 + hundreds2;
		int returnsumOfnumbers = 0;
		returnsumOfnumbers = sumOfOnes + sumOftens + sumOfhundreds;
		
		 
		/*Check if each corresponding place in the two numbers 
		 * (ones, tens, hundreds, ...) sums to the same total.
		 */
		System.out.println(number1 + number2);
		System.out.println(hundreds1); //gives hundreds place value for the first 3 digit number
		System.out.println(tens1); //gives tens place value for the first 3 digit number
		System.out.println(ones1); //gives ones place value for the first 3 digit number
		
		System.out.println(hundreds1 + hundreds2);
		System.out.println(tens1 + tens2);
		System.out.println(ones1 + ones2); 
		
		if(sumOfhundreds == sumOftens){ //check to see if the sum of place values are equal.
			System.out.println(true); //if the sums add up it's true
		if (sumOftens == sumOfOnes) //check to see if it is a 3 digit number
	            System.out.println(true);
	        }else {
	        	System.out.println(false);//try two other numbers 
	  
	        	
	        	
	   
	   
	        		
	        	}
	    }    
	}

		


