package Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		System.out.println("Enter User Name: ");
		userName = myObj.nextLine();
		
		
		System.out.println("Username is : " + userName);

	}

}
