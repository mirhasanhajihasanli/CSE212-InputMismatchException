import java.util.Scanner;

public class GamePass implements CustomerSavings {
	
	int duration=30;
	double price;
	Customer customer;
	
	public GamePass(Customer customer) {
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter price of the gamepass ");
		this.price=myScanner.nextDouble();
		myScanner.nextLine();
		this.customer=customer;
	}
	public void displayAllRentals() {
		System.out.println(" ");
		System.out.println("Customer: "+this.customer.name+" "+this.customer.surname);
		System.out.println("GamePass");
		System.out.println("Duration: "+this.duration);
		System.out.println("Sub price: "+this.price);
		System.out.println(" ");
	}
	public void calculateSavingsPerItem() {
		System.out.println("GamePass savings per item: "+this.price/((this.duration)*1000));
	}

}
