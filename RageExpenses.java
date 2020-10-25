
/*10.* Rage Expenses - Изпитна задача
As a MOBA challenger player, Pesho has the bad habit to trash his PC when he loses a game and rage quits. His gaming setup consists of headset, mouse, keyboard and display. You will receive Pesho`s lost games count. 
Every second lost game, Pesho trashes his headset.
Every third lost game, Pesho trashes his mouse.
When Pesho trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
Every second time, when he trashes his keyboard, he also trashes his display. 
You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment. 
Input / Constraints
•	On the first input line - lost games count – integer in the range [0, 1000].
•	On the second line – headset price - floating point number in range [0, 1000]. 
•	On the third line – mouse price - floating point number in range [0, 1000]. 
•	On the fourth line – keyboard price - floating point number in range [0, 1000]. 
•	On the fifth line – display price - floating point number in range [0, 1000]. 
Output
•	As output you must print Pesho`s total expenses: "Rage expenses: {expenses} lv."
•	Allowed working time / memory: 100ms / 16MB.
Examples
Input	Output	Comment
7
2
3
4
5	Rage expenses: 16.00 lv.	Trashed headset -> 3 times
Trashed mouse -> 2 times
Trashed keyboard -> 1 time
Total: 6 + 6 + 4 = 16.00 lv;
23
12.50
21.50
40
200	Rage expenses: 608.00 lv.	
 * */
import java.util.Scanner;
public class RageExpenses {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberLostGame = Integer.parseInt(scanner.nextLine());
		if (numberLostGame>=0 && numberLostGame<=1000) {
			double  headsetPrice  = Double.parseDouble(scanner.nextLine()); 
			if (headsetPrice >=0 && headsetPrice<=1000) {
				double  mousePrice  = Double.parseDouble(scanner.nextLine());  
				if (mousePrice>=0 && mousePrice<=1000) {
					double  keyboardPrice   = Double.parseDouble(scanner.nextLine()); 
					if (keyboardPrice>=0 && keyboardPrice<=1000) {
					double displayPrice = Double.parseDouble(scanner.nextLine());  
					if (displayPrice>=0 && displayPrice<=1000) {
						double countHeadSet = 0;
						double countMouse = 0;
						double countKeyboard = 0;
						double countDisplay = 0;
						double totalSum = 0;
					for (int i = 1; i <= numberLostGame; i++) {
						if (i%2==0) {
							countHeadSet++;  
						}
						if (i%3==0) {
							countMouse+=1; 
						}
						if (i%6==0) {
							countKeyboard+=1;
						}
						if (i%13==0) {
							countDisplay+=1;
						}
					}
					totalSum = headsetPrice*countHeadSet
							+ countMouse*mousePrice
							+ countKeyboard*keyboardPrice
							+ countDisplay*displayPrice;
					System.out.printf("Rage expenses: %.2f lv.",totalSum);
						} else {
							System.out.println("Invalid value for parameter. Please 0 to 1000");
						}	
					} else {
						System.out.println("Invalid value for parameter. Please 0 to 1000");
					}
				} else {
					System.out.println("Invalid value for parameter. Please 0 to 1000");
				}
			} else {
				System.out.println("Invalid value for parameter. Please 0 to 1000");
			}
		} else {
			System.out.println("Invalid value for parameter. Please 0 to 1000");
		}
	}
}
