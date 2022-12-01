

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;



public class rentalTest {
	public static void main(String[] args) {
		int menuSelect=1;
		ArrayList<Customer> Customers = new ArrayList<Customer>();
		ArrayList<DVDRental> Rentals=new ArrayList<DVDRental>();
		ArrayList<CustomerSavings> cSavings=new ArrayList<CustomerSavings>();
		while(menuSelect!=0) {
			Scanner myScanner=new Scanner(System.in);
			System.out.println("Add a new customer (use 1)");
			System.out.println("Rent a movie (use 2)");
			System.out.println("Rent a movie (Custom duration) (use 3)");
			System.out.println("Rent a GamePass (use 4)");
			System.out.println("Display all rentals (use 5)");
			System.out.println("Calculate savings (use 6)");
			System.out.println("Exit (use 0)");
			menuSelect=myScanner.nextInt();
			switch(menuSelect) {
				case 1:
					Customers.add(new Customer());
					break;
				case 2:
					int switchInt;
					System.out.println("DVDRental (use 1)");
					System.out.println("TrilogySaga Rental (use 2)");
					System.out.println("Streaming Service Rental (use 3)");
					switchInt=myScanner.nextInt();
					switch(switchInt) {
					
						case 1:
							int id = 0;
							int flag=0;
							String mName;
							Customer cust=null;
							System.out.println("Enter customer id");
							boolean flag_bool = true;
							do {
								try {
									id = myScanner.nextInt();
									flag_bool=false;
								}
								catch(InputMismatchException e) {
									System.out.println("Error, please enter valid customer ID");
									myScanner.nextInt();
								}
							} while (flag_bool);
							//id=myScanner.nextInt();
							myScanner.nextLine();
							Iterator<Customer> cust_it = Customers.iterator();
							while(cust_it.hasNext()) {
								Customer tmp_cust=cust_it.next();
								if (id==tmp_cust.id) {
									flag=1;
									cust=tmp_cust;
									break;
								}
								else {
									flag=0;
								}
							}
							if (flag==1) {
								System.out.println("Enter Movie name: ");
								mName=myScanner.nextLine();
								Rentals.add(new DVDRental(cust,mName));
								System.out.println("Creating Rental...");
								break;
							}
							else {
								System.out.println("No customer found with given id.");
								break;
							}
						case 2:
							int id2;
							int flag2=0;
							String mName2;
							Customer cust2=null;
							System.out.println("Enter customer id");
							id2=myScanner.nextInt();
							myScanner.nextLine();
							Iterator<Customer> cust_it2 = Customers.iterator();
							while(cust_it2.hasNext()) {
								Customer tmp_cust=cust_it2.next();
								if (id2==tmp_cust.id) {
									flag2=1;
									cust2=tmp_cust;
									break;
								}
								else {
									flag2=0;
								}
							}
							if (flag2==1) {
								System.out.println("Enter Movie name: ");
								mName2=myScanner.nextLine();
								Rentals.add(new TrilogySagaRental(cust2,mName2));
								System.out.println("Creating Rental...");
								break;
							}
							else {
								System.out.println("No customer found with given id.");
								break;
							}
						case 3:
							int id3;
							int flag3=0;
							String mName3;
							Customer cust3=null;
							System.out.println("Enter customer id");
							id3=myScanner.nextInt();
							myScanner.nextLine();
							Iterator<Customer> cust_it3 = Customers.iterator();
							while(cust_it3.hasNext()) {
								Customer tmp_cust=cust_it3.next();
								if (id3==tmp_cust.id) {
									flag3=1;
									cust3=tmp_cust;
									break;
								}
								else {
									flag3=0;
								}
							}
							if (flag3==1) {
								System.out.println("Enter Movie name: ");
								mName3=myScanner.nextLine();
								Rentals.add(new StreamingRental(cust3,mName3));
								System.out.println("Creating Rental...");
								break;
							}
							else {
								System.out.println("No customer found with given id.");
								break;
							}
							
					}
					break;
				case 3:
					int switchInt2;
					System.out.println("DVDRental (use 1)");
					System.out.println("TrilogySaga Rental (use 2)");
					System.out.println("Streaming Service Rental (use 3)");
					switchInt2=myScanner.nextInt();
					switch(switchInt2) {
					
						case 1:
							int id2;
							int flag2=0;
							String mName2;
							Customer cust2=null;
							int dur;
							System.out.printf("%d\n","Enter customer id");
							id2=myScanner.nextInt();
							myScanner.nextLine();
							Iterator<Customer> cust_it2 = Customers.iterator();
							while(cust_it2.hasNext()) {
								Customer tmp_cust=cust_it2.next();
								if (id2==tmp_cust.id) {
									flag2=1;
									cust2=tmp_cust;
									break;
								}
								else {
									flag2=0;
								}
							}
							if (flag2==1) {
								System.out.printf("%s\n","Enter Movie name: ");
								mName2=myScanner.nextLine();
								System.out.printf("%d\n","Enter Duration: ");
								dur=myScanner.nextInt();
								myScanner.nextLine();
								Rentals.add(new DVDRental(cust2,mName2,dur));
								System.out.println("Creating Rental...");
								break;
							}
							else {
								System.out.println("No customer found with given id.");
								break;
							}
						case 2:
							int id;
							int flag=0;
							String mName;
							Customer cust=null;
							int dur2;
							System.out.printf("%d\n","Enter customer id");
							id=myScanner.nextInt();
							myScanner.nextLine();
							Iterator<Customer> cust_it = Customers.iterator();
							while(cust_it.hasNext()) {
								Customer tmp_cust=cust_it.next();
								if (id==tmp_cust.id) {
									flag=1;
									cust=tmp_cust;
									break;
								}
								else {
									flag=0;
								}
							}
							if (flag==1) {
								System.out.printf("%s\n","Enter Movie name: ");
								mName=myScanner.nextLine();
								System.out.printf("%d\n","Enter Duration: ");
								dur2=myScanner.nextInt();
								myScanner.nextLine();
								Rentals.add(new TrilogySagaRental(cust,mName,dur2));
								System.out.println("Creating Rental...");
								break;
							}
							else {
								System.out.println("No customer found with given id.");
								break;
							}
						case 3:
							int id3;
							int flag3=0;
							String mName3;
							Customer cust3=null;
							int dur3;
							System.out.printf("%d\n","Enter customer id");
							id3=myScanner.nextInt();
							myScanner.nextLine();
							Iterator<Customer> cust_it3 = Customers.iterator();
							while(cust_it3.hasNext()) {
								Customer tmp_cust=cust_it3.next();
								if (id3==tmp_cust.id) {
									flag3=1;
									cust3=tmp_cust;
									break;
								}
								else {
									flag3=0;
								}
							}
							if (flag3==1) {
								System.out.printf("%s\n","Enter Movie name: ");
								mName3=myScanner.nextLine();
								System.out.printf("%d\n","Enter Duration: ");
								dur3=myScanner.nextInt();
								myScanner.nextLine();
								Rentals.add(new TrilogySagaRental(cust3,mName3,dur3));
								System.out.println("Creating Rental...");
								break;
							}
							else {
								System.out.println("No customer found with given id.");
								break;
							}
							
					}
					break;
				case 4:
					int id;
					int flag=0;
					String mName;
					Customer cust=null;
					System.out.println("Enter customer id");
					id=myScanner.nextInt();
					myScanner.nextLine();
					Iterator<Customer> cust_it = Customers.iterator();
					while(cust_it.hasNext()) {
						Customer tmp_cust=cust_it.next();
						if (id==tmp_cust.id) {
							flag=1;
							cust=tmp_cust;
							break;
						}
						else {
							flag=0;
						}
					}
					if (flag==1) {
						cSavings.add(new GamePass(cust));
						break;
					}
					else {
						System.out.println("No customer found with given id.");
						break;
					}
				case 5:
					Collections.sort(Rentals);
					Iterator<DVDRental> rent_it1 = Rentals.iterator();
					while (rent_it1.hasNext()) {
						rent_it1.next().displayAllRentals();	
					}
					break;
					
				case 6:
					Iterator<CustomerSavings> rent_it = cSavings.iterator();
					while (rent_it.hasNext()) {
						rent_it.next().calculateSavingsPerItem();	
					}
					break;
					
				
				
					
			}
		}
		
	}

}
