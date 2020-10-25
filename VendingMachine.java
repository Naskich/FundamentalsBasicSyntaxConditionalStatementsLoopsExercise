
/* 7.	Vending Machine
You task is to calculate the total price of a purchase from a vending machine.
 Until you receive "Start" you will be given different coins that are being
 inserted in the machine. You have to sum them in order to have the total money
 inserted. There is a problem though. Your vending machine only works with
  0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins
 you have to display "Cannot accept {money}", where the value is formated to
  the second digit after the decimal point and not add it to the total money.
 On the next few lines until you receive "End" you will be given products to purchase.
 Your machine has however only "Nuts", "Water", "Crisps", "Soda", "Coke".
  The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. 
 If the person tries to purchase a not existing product print “Invalid product”. 
 Be careful that the person may try to purchase a product for which he doesn't have money. 
 In that case print "Sorry, not enough money". If the person purchases a product successfully
 print "Purchased {product name}". 
 After the “End” command print the money that are left formatted to the second decimal
 point in the format "Change: {money left}".
Examples
Input	Output
1
1
0.5
0.6
Start
Coke
Soda
Crisps
End	Cannot accept 0.60
Purchased Coke
Purchased Soda
Sorry, not enough money
Change: 0.70
 * */
import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			String stokPrise = scanner.nextLine();
			double sumMoney = 0;
			double valueStok = 0;
			double balanceCoins = 0;		
			while (!stokPrise.equals("Start")) {
				valueStok = Double.valueOf(stokPrise);
			if (valueStok==0.1||valueStok==0.2 || valueStok==0.5 || valueStok==1 || valueStok==2) {
				balanceCoins += valueStok;
			} else {
				System.out.printf("Cannot accept %.2f\n",valueStok );
			}
				stokPrise = scanner.nextLine();
			}
			String stokMachine = scanner.nextLine();
			while (!stokMachine.equals("End")) {
				
				switch (stokMachine) {
				
				case "Nuts":
					 if (balanceCoins>=2.0) {
						balanceCoins-=2;
						System.out.println("Purchased Nuts");
					} else {
						System.out.println("Sorry, not enough money");
					}
					break;
					case "Water":
						 if (balanceCoins>=0.7) {
								balanceCoins-=0.7;
								System.out.println("Purchased Water");
							} else {
								System.out.println("Sorry, not enough money");
							}						
					break;
					case "Crisps":
						 if (balanceCoins>=1.5) {
								balanceCoins-=1.5;
								System.out.println("Purchased Crips");
							} else {
								System.out.println("Sorry, not enough money");
							}					
						break;
					case "Soda":
						 if (balanceCoins>=0.8) {
								balanceCoins-=0.8;
								System.out.println("Purchased Soda");
							} else {
								System.out.println("Sorry, not enough money");
							}					
						break;
					case "Coke":
						 if (balanceCoins>=1.0) {
								balanceCoins-=1.0;
								System.out.println("Purchased Coke");
							} else {
								System.out.println("Sorry, not enough money");
							}					
						break;			
				default:
					System.out.println("Invalid product");
					break;
				}
				stokMachine = scanner.nextLine();
			}	
			System.out.printf("Change: %.2f",balanceCoins);
	}
}
