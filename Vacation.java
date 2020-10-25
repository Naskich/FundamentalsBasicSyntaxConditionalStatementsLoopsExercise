
/*3.	Vacation
You are given a group of people, type of the group, on which day of the week they are going to stay. Based on that information calculate how much they have to pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.
	Friday	Saturday	Sunday
Students	8.45	9.80	10.46
Business	10.90	15.60	16
Regular	15	20	22.50
There are also discounts based on some conditions:
•	Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
•	Business – if the group is bigger than or equal to  100 people 10 of them can stay for free.
•	Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5% 
You should reduce the prices in that EXACT order
Examples
Input	Output
30
Students
Sunday	Total price: 266.73
40
Regular
Saturday	Total price: 800.00

 * */
import java.util.Scanner;
public class Vacation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  int numberPerson = Integer.parseInt(scanner.nextLine());
		  String typePerson = scanner.nextLine();
		  String dayOfWeek = scanner.nextLine();
		  double sumTotal = 0;
		  switch (dayOfWeek) {
		case "Friday":
				if (typePerson.equals("Students")) {
					if (numberPerson>=30) {
					  sumTotal =(numberPerson*8.45)-(numberPerson*8.45)*0.15;
					  System.out.printf("Total price: %.2f",sumTotal);
					} else {
						sumTotal =numberPerson*8.45;
					     System.out.printf("Total price: %.2f",sumTotal);
					}
				}
				if (typePerson.equals("Business")) {
					if (numberPerson>=100) {
						numberPerson =numberPerson-10;
						  sumTotal =numberPerson*10.90;
						  System.out.printf("Total price: %.2f",sumTotal);
						} else {
							sumTotal =numberPerson*10.90;
						     System.out.printf("Total price: %.2f",sumTotal);
						}
					
				}
				if (typePerson.equals("Regular")) {
					if (numberPerson>=10 && numberPerson<=20) {
						  sumTotal =(numberPerson*15.00)-(numberPerson*15.00)*0.05;
						  System.out.printf("Total price: %.2f",sumTotal);
						} else {
							sumTotal =numberPerson*15.00;
						     System.out.printf("Total price: %.2f",sumTotal);
						}
				}
				break;
		case "Saturday":
			if (typePerson.equals("Students")) {
				if (numberPerson>=30) {
				  sumTotal =(numberPerson*9.80)-(numberPerson*9.80)*0.15;
				  System.out.printf("Total price: %.2f",sumTotal);
				} else {
					sumTotal =numberPerson*9.80;
				     System.out.printf("Total price: %.2f",sumTotal);
				}
			}
			if (typePerson.equals("Business")) {
				if (numberPerson>=100) {
					numberPerson =numberPerson-10;
					  sumTotal =numberPerson*15.60;
					  System.out.printf("Total price: %.2f",sumTotal);
					} else {
						sumTotal =numberPerson*15.60;
					     System.out.printf("Total price: %.2f",sumTotal);
					}		
			}
			if (typePerson.equals("Regular")) {
				if (numberPerson>=10 && numberPerson<=20) {
					  sumTotal =(numberPerson*20.00)-(numberPerson*20.00)*0.05;
					  System.out.printf("Total price: %.2f",sumTotal);
					} else {
						sumTotal =numberPerson*20.00;
					     System.out.printf("Total price: %.2f",sumTotal);
					}
			}
				break;
		case "Sunday":
			if (typePerson.equals("Students")) {
				if (numberPerson>=30) {
				  sumTotal =(numberPerson*10.46)-(numberPerson*10.46)*0.15;
				  System.out.printf("Total price: %.2f",sumTotal);
				} else {
					sumTotal =numberPerson*10.46;
				     System.out.printf("Total price: %.2f",sumTotal);
				}
			}
			if (typePerson.equals("Business")) {
				if (numberPerson>=100) {
					numberPerson =numberPerson-10;
					  sumTotal =numberPerson*16.00;
					  System.out.printf("Total price: %.2f",sumTotal);
					} else {
						sumTotal =numberPerson*16.00;
					     System.out.printf("Total price: %.2f",sumTotal);
					}			
			}
			if (typePerson.equals("Regular")) {
				if (numberPerson>=10 && numberPerson<=20) {
					  sumTotal =(numberPerson*22.50)-(numberPerson*22.50)*0.05;
					  System.out.printf("Total price: %.2f",sumTotal);
					} else {
						sumTotal =numberPerson*22.50;
					     System.out.printf("Total price: %.2f",sumTotal);
					}
			}
			 break;
		}		  
	}
}
