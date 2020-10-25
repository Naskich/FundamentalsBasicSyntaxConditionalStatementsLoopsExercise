
/* 5. Login
 * *You will be given a string representing a username. 
 * The password will be that username reversed. 
 * Until you receive the correct password print on the console 
 * "Incorrect password. Try again.". When you receive the correct 
 * password print "User {username} logged in." However on the fourth
 *  try if the password is still not correct print "User {username} blocked!" 
 *  and end the program.
Examples
Input	Output
Acer
login
go
let me in
recA
	Incorrect password. Try again.
Incorrect password. Try again.
Incorrect password. Try again.
User Acer logged in.
momo
omom	User momo logged in.
sunny
rainy
cloudy
sunny
not sunny	Incorrect password. Try again.
Incorrect password. Try again.
Incorrect password. Try again.
User sunny blocked!

 * */
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userPass = scanner.nextLine();
		    StringBuilder trueLoginPass = new StringBuilder(userPass);
		    trueLoginPass.reverse();		    
		    String loginPassword = scanner.nextLine(); 
		    int number = 0;
		    if (loginPassword.contentEquals(trueLoginPass)) {
		    	System.out.println("User "+userPass+" logged in.");
			}else{
				while (!loginPassword.contentEquals(trueLoginPass)) {
					number+=1;
					if (number>3) {
						System.out.println("User "+userPass+" blocked!");
						break;
					}
					System.out.println("Incorrect password. Try again.");
					loginPassword=scanner.nextLine();
					if (loginPassword.contentEquals(trueLoginPass)) {
						System.out.println("User "+userPass+" logged in.");
						break;
					}
				}
			}
		}
	}