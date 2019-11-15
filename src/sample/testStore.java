package Project3_Store;

import java.util.Scanner;

public class testStore {

	public static void main(String[] args) {
		Store store = new Store();
		
		String menu = "\n1. Add Customer"+"\n2.Remove Customer"+"\n3.Print all Customers";
		int menuChoice;
		Scanner in = new Scanner(System.in);
		
		System.out.println(menu);
		menuChoice = in.nextInt();
		
		while(menuChoice!= 7) {
			switch(menuChoice) {
			case 1: 
				System.out.println("Enter First name: ");
				String first = in.next();
				
				System.out.println("Enter last name: ");
				String last = in.next();
				
				System.out.println("Enter ID: ");
				int  id = in.nextInt();
				
				Customer c = new Customer(id,first,last);
				store.addCustomer(c);
				
				break;
			case 2:
				System.out.println("Enter index of customer to remove: ");
				int index= in.nextInt();
				
				store.removeCustomer(index -1);
			case 3:
				store.showCustomers();
				
			}
			System.out.println(menu);
			menuChoice = in.nextInt();
		}
	}

}
