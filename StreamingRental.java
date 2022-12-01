

import java.util.Scanner;

public class StreamingRental extends DVDRental {
	String streamingService;
	double subCost;
	
	public StreamingRental(Customer cust, String movieName) {
		super(cust,movieName);
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter Streaming Service: ");
		this.streamingService=myScanner.nextLine();
		this.subCost=super.price;
		
		
		
	}
	public StreamingRental(Customer cust, String movieName, int dur) {
		super(cust,movieName,dur);
		
	}
	public void displayAllRentals() {
		System.out.println(" ");
		System.out.println("Customer: "+super.customer.name+" "+super.customer.surname);
		System.out.println("Movie: "+super.movieName);
		System.out.println("Streaming Service: "+this.streamingService);
		System.out.println("Sub cost: "+"$"+this.subCost);
		System.out.println("Duration: "+super.duration+" days");
		System.out.println(" ");
	}
	public void calculateSavingsPerItem() {
		System.out.println("Movie "+super.movieName+" savings per item: "+(this.subCost)/(1000000));
	}
	
}
