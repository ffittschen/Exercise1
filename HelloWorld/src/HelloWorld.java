/**
 * 
 */

import java.util.Scanner;

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = reader.nextLine();

		HelloUser helloUser = new HelloUser(name);

		helloUser.greetUser();
	}

}
