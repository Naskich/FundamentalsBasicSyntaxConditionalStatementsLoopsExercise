
/*8.	Triangle of Numbers
Write a program, which receives a number � n, and prints a triangle from 1 to n as in the examples.
Constraints
�	n will be in the interval [1...20].
Examples
Input	Output		Input	Output		Input	Output
3	
1
2 2 
3 3 3
		
5	
1
2 2 
3 3 3
4 4 4 4
5 5 5 5 5
		
6	
1
2 2 
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6

 * */
import java.util.Scanner;
public class TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());	
		for (int i = 1; i <= number ; i++) {		
			for (int j = 1; j <= i; j++) {
			System.out.printf("%d ",i);
			}
			System.out.println();
		}
	}
}
