
/*6.	Strong Number
Write a program to check if a given number is a strong number or not. 
A number is strong if the sum of the Factorial of each digit is equal to the number.
 For example 145 is a strong number, because 1! + 4! + 5! = 145. Print "yes" if the number
  is strong and "no" if the number is not strong.
Examples
Input	Output
2	yes
3451	no
40585	yes
 * */
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in );
		int numberFacturiel = Integer.parseInt(scanner.nextLine());
	//	String numberFacturiel = scanner.nextLine();
		if (numberFacturiel>0 && numberFacturiel<1000000) {
			int lastSum=0;
			if (numberFacturiel>100000 && numberFacturiel<1000000) {
			int firstDigit = numberFacturiel/100000;
			int factNumber1 = 1;
			for (int i = 1; i <= firstDigit; i++) {
			       factNumber1 = factNumber1 * i;     
			    }	
			int secondDigit = (numberFacturiel/10000)%10;
			int factNumber2 = 1;
			for (int i = 1; i <= secondDigit; i++) {
			       factNumber2 = factNumber2 * i; 
			}   		
			int thirdDigit = (numberFacturiel/1000)%10;
			int factNumber3 = 1;
			for (int i = 1; i <= thirdDigit; i++) {
			       factNumber3 = factNumber3 * i;     
			    }
			int fourDigit =(numberFacturiel/100)%10;
			int factNumber4 = 1;
			for (int i = 1; i <= fourDigit; i++) {
			       factNumber4 = factNumber4 * i;     
			    }
			int fiveDigit = (numberFacturiel/10)%10;
			int factNumber5 = 1;
			for (int i = 1; i <=fiveDigit; i++) {
			       factNumber5 = factNumber5 * i;     
			    }
			int sixDigit = numberFacturiel%10;
			int factNumber6 = 1;
			for (int i = 1; i <=sixDigit; i++) {
			       factNumber6 = factNumber6 * i;     
			    }		
	lastSum = factNumber6 + factNumber5 + factNumber4 + factNumber3 + factNumber2 + factNumber1;
			}		
			if (numberFacturiel>10000 && numberFacturiel<=100000) {  // 40585
			int secondDigit = (numberFacturiel/10000)%10;
			int factNumber2 = 1;
			for (int i = 1; i <= secondDigit; i++) {
			       factNumber2 = factNumber2 * i;     
			    }
			int thirdDigit = (numberFacturiel/1000)%10;
			int factNumber3 = 1;
			for (int i = 1; i <= thirdDigit; i++) {
			       factNumber3 = factNumber3 * i;     
			    }
			int fourDigit =(numberFacturiel/100)%10;
			int factNumber4 = 1;
			for (int i = 1; i <= fourDigit; i++) {
			       factNumber4 = factNumber4 * i;     
			    }
			int fiveDigit = (numberFacturiel/10)%10;
			int factNumber5 = 1;
			for (int i = 1; i <=fiveDigit; i++) {
			       factNumber5 = factNumber5 * i;     
			    }
			int sixDigit = numberFacturiel%10;
			int factNumber6 = 1;
			for (int i = 1; i <=sixDigit; i++) {
			       factNumber6 = factNumber6 * i;     
			    }
			
			lastSum = factNumber6 + factNumber5 + factNumber4 + factNumber3 + factNumber2;
			}		
			if (numberFacturiel>1000 && numberFacturiel<=10000) {		
			int thirdDigit = (numberFacturiel/1000)%10;
			int factNumber3 = 1;
			for (int i = 1; i <= thirdDigit; i++) {
			       factNumber3 = factNumber3 * i;     
			    }
			int fourDigit =(numberFacturiel/100)%10;
			int factNumber4 = 1;
			for (int i = 1; i <= fourDigit; i++) {
			       factNumber4 = factNumber4 * i;     
			    }
			int fiveDigit = (numberFacturiel/10)%10;
			int factNumber5 = 1;
			for (int i = 1; i <=fiveDigit; i++) {
			       factNumber5 = factNumber5 * i;     
			    }
			int sixDigit = numberFacturiel%10;
			int factNumber6 = 1;
			for (int i = 1; i <=sixDigit; i++) {
			       factNumber6 = factNumber6 * i;     
			    }
			lastSum = factNumber6 + factNumber5 + factNumber4 + factNumber3;
			}		
			if (numberFacturiel>99 && numberFacturiel<1000) {
				int fourDigit =(numberFacturiel/100)%10;
				int factNumber4 = 1;
				for (int i = 1; i <= fourDigit; i++) {
				       factNumber4 = factNumber4 * i;     
				    }
				int fiveDigit = (numberFacturiel/10)%10;
				int factNumber5 = 1;
				for (int i = 1; i <=fiveDigit; i++) {
				       factNumber5 = factNumber5 * i;     
				    }
				int sixDigit = numberFacturiel%10;
				int factNumber6 = 1;
				for (int i = 1; i <=sixDigit; i++) {
				       factNumber6 = factNumber6 * i;     
				    }
				lastSum = factNumber6 + factNumber5 + factNumber4;
			}
		if (numberFacturiel>10 && numberFacturiel<100) {		
			int fiveDigit = (numberFacturiel/10)%10;
			int factNumber5 = 1;
			for (int i = 0; i <=fiveDigit; i++) {
			       factNumber5 = factNumber5 * i;     
			    }
			int sixDigit = numberFacturiel%10;
			int factNumber6 = 1;
			for (int i = 1; i <=sixDigit; i++) {
			       factNumber6 = factNumber6 * i;     
			    }
			lastSum = factNumber6 + factNumber5;
		}		
		if (numberFacturiel>0 && numberFacturiel<10) {	
			int sixDigit = numberFacturiel%10;
			int factNumber6 = 1;
			for (int i = 1; i <=sixDigit; i++) {
			       factNumber6 = factNumber6 * i;     
			    }
			lastSum = factNumber6;
		}	
			if (numberFacturiel==lastSum) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

	} else {
		System.out.print("Inavalid paraeter or out of range exeption! Please insert 0 to 100000!");
		}
	}
}
