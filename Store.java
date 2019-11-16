package Project3_Store;

import java.util.ArrayList;

public class Store {
	ArrayList<Item> stock = new ArrayList<>();
	ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<ShoppingCart> carts = new ArrayList<>();
	
	// getters and setters
	public void setStock(ArrayList<Item> s) {
		this.stock = s ;
	}
	public ArrayList<Item> getStock(){
		return this.stock;
	}
	public void setCustomers(ArrayList<Customer> c) {
		this.customers = c ;
	}
	public ArrayList<Customer> getCustomers(){
		return this.customers;
	}
	public void setCarts(ArrayList<ShoppingCart> carts) {
		this.carts = carts ;
	}
	public ArrayList<ShoppingCart> getCarts(){
		return this.carts;
	}
	//add And remove customers
	public void addCustomer(Customer x) {
		customers.add(x);
		carts.add(x.getShopingCart());
	}
	public void removeCustomer(int index) {
		customers.remove(index);
	}
	//add and remove items to carts
	public void addItem(Item x, int CustIndex) {
		customers.get(CustIndex).getShopingCart().addToCart(x);
	}
	public void removeItem(Item x, int custIndex) {
		customers.get(custIndex).getShopingCart().removeFromCart(x);
	}
	//print available items in store
	public void showItems() {
		for(int i =0; i<stock.size();i++) {
			System.out.println(stock.get(i).toString());
		}
	}
	//print all customers
	public void showCustomers() {
		if(customers.size()==0) {
			System.out.print("No customers yet.");
		}
		for(int i =0; i<customers.size();i++) {
			System.out.println("\n"+(i+1)+". "+customers.get(i).toString());
		}
	}
}
