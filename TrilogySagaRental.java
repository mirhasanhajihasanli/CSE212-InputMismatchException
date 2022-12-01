

import java.util.ArrayList;
import java.util.Scanner;

public class TrilogySagaRental extends DVDRental {
	ArrayList<String> chapterNames = new ArrayList<String>();
	int numberOfChapters;
	
	public TrilogySagaRental(Customer customer, String movieName) {
		super(customer,movieName);
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter number of chapters");
		this.numberOfChapters=myScanner.nextInt();
		myScanner.nextLine();
		for (int i=0;i<numberOfChapters;i++) {
			int chap=i+1;
			System.out.println("Enter Chapter "+chap+": ");
			String chapter=myScanner.nextLine();
			chapterNames.add(chapter);
		}
	}
	public TrilogySagaRental(Customer customer, String movieName, int dur) {
		super(customer,movieName,dur);
		for (int i=0;i<chapterNames.size();i++) {
			Scanner myScanner=new Scanner(System.in);
			System.out.println("Enter Chapter "+i+": ");
			String chapter=myScanner.nextLine();
			chapterNames.add(chapter);
		}
	}
	public void displayAllRentals() {
		System.out.println(" ");
		System.out.println("Customer: "+super.customer.name+" "+super.customer.surname);
		System.out.println("Trilogy/Saga: "+super.movieName);
		for(int i=0;i<chapterNames.size();i++) {
			int chap=i+1;
			System.out.println("Chapter "+chap+": "+ chapterNames.get(i));
		}
		System.out.println("Duration: "+super.duration+" days");
		System.out.println(" ");
		
	}
	public void calculateSavingsPerItem() {
		System.out.println("Movie "+super.movieName+" savings per item: "+(super.price)/this.numberOfChapters);
	}
}
