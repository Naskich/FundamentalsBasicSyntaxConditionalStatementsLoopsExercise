
/*9.*Padawan Equipment
Yoda is starting his newly created Jedi academy. So, he asked master 
Ivan Cho to buy the needed equipment. The number of items depends on
 how many students will sign up. The equipment for the Padawan contains 
 lightsabers, belts and robes. 
You will be given the amount of money Ivan Cho has, the number of students
 and the prices of each item. You have to help Ivan Cho calculate if the money
  he has is enough to buy all of the equipment, or how much more money he needs. 
Because the lightsabres sometimes brake, Ivan Cho should buy 10% more, rounded 
up to the next integer. Also, every sixth belt is free. 
Input / Constraints
The input data should be read from the console. It will consist of exactly 5 lines:
•	The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
•	The count of students – integer in range [0…100]
•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
•	The price of belts for a single belt – floating-point number in range [0.00…100.00]
The input data will always be valid. There is no need to check it explicitly.
Output
The output should be printed on the console.
•	If the calculated price of the equipment is less or equal to the money Ivan Cho has:
o	"The money is enough - it would cost {the cost of the equipment}lv."
•	If the calculated price of the equipment is more than the money Ivan Cho has:
o	 "Ivan Cho will need {neededMoney}lv more."
•	All prices must be rounded to two digits after the decimal point.
Examples
Input	Output	Comments
100
2
1.0
2.0
3.0	The money is enough - it would cost 13.00lv.	Needed equipment for 2 padawans  :
sabresPrice*(studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice*(studentsCount-freeBelts) 
1*(3) + 2*(2) + 3*(2) = 13.00
13.00 <= 100 – the money will be enough.
Input	Output	Comments
100
42
12.0
4.0
3.0	Ivan Cho will need 737.00lv more.	Needed equipment for 42 padawans:
12*47 + 4*42 + 3*35 = 837.00
837 > 100 – need 737.00 lv. more.

 * */
import java.util.Scanner;
public class PadawanEquipment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float mountMoney = Float.parseFloat(scanner.nextLine()); 
		if (mountMoney>=0 && mountMoney<=1000) {
			int numberStudents = Integer.parseInt(scanner.nextLine());
			if (numberStudents>=0 && numberStudents<=100) {
				float lightsabersPrice = Float.parseFloat(scanner.nextLine()); 
				if (lightsabersPrice>=0 && lightsabersPrice<=100) {
					float robesPrice = Float.parseFloat(scanner.nextLine());  
					if (robesPrice>=0 && robesPrice<=100) {
						float beltsPrice = Float.parseFloat(scanner.nextLine()); 
						if (beltsPrice>=0 && beltsPrice<=100) {
							double moneyMont=(double)mountMoney;
							double priceLightsabers=(double)lightsabersPrice;
							double robes=(double)robesPrice;
							double belts=(double)beltsPrice;	
							double lastSum=0;
							int count =0;
							double midleSum=0;
							double midlePercent = 0;
							double studentsAround =0;
							if (numberStudents>=6) {
								for (int i = 6; i <= numberStudents; i++) {
									if (i%6==0) {
										count++;  
									}			
								}
							} else {
								count=0;
							}
							midleSum = numberStudents%10;
							if (midleSum>0) {
								midlePercent+=1; 
							} else {
								midlePercent=0; 
							} 		
							studentsAround = midlePercent+(numberStudents*0.1); 
							double roundLast = Math.round(studentsAround*100)/100;  
							double sum = priceLightsabers*(numberStudents+(roundLast)) 
									+(robes*numberStudents)+
									+(belts*(numberStudents-count)); 
							if (moneyMont>=sum) {
								System.out.printf("The money is enough - it would cost %.2flv.",sum);
							}else {
								lastSum=sum-moneyMont;
								System.out.printf("Ivan Cho will need %.2flv more.",lastSum);
							}
						} else {
							System.out.print("Inavlid data type or range!");
						}
					} else {
						System.out.print("Inavlid data type or range!");
					}
				} else {
					System.out.print("Inavlid data type or range!");
				}
			} else {
				System.out.print("Inavlid data! Please 0 to 100!");
			}
		} else {
			System.out.print("Inavlid data type or range!");
		}
	}
}