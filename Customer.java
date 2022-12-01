

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
	int id;
	String name;
	String surname;
	int age;
	int postCode;
	String email;
	
	public Customer() {
		Scanner myScanner=new Scanner(System.in);
		System.out.printf("%s\n","Enter name");
		name=myScanner.nextLine();
		System.out.printf("%s\n","Enter surname");
		surname=myScanner.nextLine();
		System.out.printf("%s\n","Enter id");
		boolean flag = true;
		do {
			try {
				id = myScanner.nextInt();
				flag=false;
			}
			catch(InputMismatchException e) {
				System.out.println("Error, please enter valid customer ID");
				myScanner.next();
			}
		} while (flag);
		//id=myScanner.nextInt();
		myScanner.nextLine();
		System.out.printf("%s\n","Enter age");
		age=myScanner.nextInt();
		myScanner.nextLine();
		System.out.printf("%s\n","Enter postCode");
		postCode=myScanner.nextInt();
		myScanner.nextLine();
		System.out.printf("%s\n","Enter email");
		email=myScanner.nextLine();
		
	}
	
	
	public void displayInfo() {
		System.out.printf("%s","\n");
		System.out.printf("name:%s\n",name);
		System.out.printf("surname:%s\n",surname);
		System.out.println("id: "+id);
		System.out.println("age: "+age);
		System.out.println("postCode: "+postCode);
		System.out.println("email: "+email);
		
	}

}

