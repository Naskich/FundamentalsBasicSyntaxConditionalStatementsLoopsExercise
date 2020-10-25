/*1.	Ages
Write a program that determines whether based on the given age a person is:
 baby, child, teenager, adult, elder. The bounders are:
•	0-2 – baby;
•	3-13 – child;
•	14-19 – teenager;
•	20-65 – adult;
•	>=66 – elder;
•	All the values are inclusive.
Examples
Input	Output
20	adult
1	baby
100	elder
* */

import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int agePerson = Integer.parseInt(scanner.nextLine());
        if (agePerson>=0 && agePerson<=2){
            System.out.println("baby");
        }
        if (agePerson>=3 && agePerson<=13){
            System.out.println("child");
        }
        if (agePerson>=14 && agePerson<=19){
            System.out.println("teenager");
        }
        if (agePerson>=20 && agePerson<=65){
            System.out.println("adult");
        }
        if (agePerson>=66){
            System.out.println("elder");
        }
    }
}
