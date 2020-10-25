

/*4.	Print and Sum
Write a program to display numbers from given start to given end and their sum. 
All the numbers will be integers. On the first line you will receive the start number,
 on the second the end number.
 * */
import java.util.Scanner;
public class PrintSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberFirst = Integer.parseInt(scanner.nextLine());
		int numberSecond = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		for (int i = numberFirst; i <=numberSecond; i++) {
			System.out.printf("%d ",i);
			sum +=i;		
		}
		System.out.printf("\nSum: %d ",sum);		
	}
}
