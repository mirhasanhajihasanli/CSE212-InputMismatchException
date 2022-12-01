import java.util.Scanner;

public class DVDRental implements CustomerSavings, Comparable<DVDRental> {
	
	Customer customer;
	String movieName;
	int duration;
	double price;
	
	public DVDRental(Customer customer, String movieName) {
		Scanner myScanner=new Scanner(System.in);
		this.movieName=movieName;
		this.customer=customer;
		this.duration=7;
		System.out.println("Enter price: ");
		this.price=myScanner.nextDouble();
		myScanner.nextLine();
	}
	public DVDRental(Customer customer, String movieName, int duration) {
		Scanner myScanner=new Scanner(System.in);
		this.movieName=movieName;
		this.customer=customer;
		this.duration=duration;
		System.out.println("Enter price: ");
		this.price=myScanner.nextDouble();
	}
	
	public void displayAllRentals() {
		System.out.println(" ");
		System.out.println("Customer: "+this.customer.name+" "+this.customer.surname);
		System.out.println("Movie: "+this.movieName);
		System.out.println("Duration: "+this.duration+" days");
		System.out.println(" ");
	}
	public void calculateSavingsPerItem() {
		System.out.println("Movie "+this.movieName+" savings per item: "+this.price);
	}
	@Override
	public int compareTo(DVDRental o) {
		if(customer.id < o.customer.id) return -1;
		if(customer.id > o.customer.id) return 1;
		else return 0;
	}
}
