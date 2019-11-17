package Project3_Store;

import java.util.ArrayList;

public class Store {
	
	// Max amount of different items in stock
	private int maxStock = 10;
	
	// Arbitrary number for max amount of items in specific inventory
	private int maxInventory = 10;
	
	// Creating stock as an arraylist of an arraylist of different items
	private ArrayList<ArrayList<Item>> stock = new ArrayList<ArrayList<Item>>(maxStock);
	
	public ArrayList<Customer> customers = new ArrayList<>();
	public ArrayList<ShoppingCart> carts = new ArrayList<>();
	
	// Creating an ArrayList movieStock for movies in stock
	private ArrayList<Movie> movieStock = new ArrayList<Movie>(maxInventory);
	
	// Creating movies to stock the movieStock ArrayList
	private movie1 = new Movie("The Matrix", "A movie starring Keanu Reeves", 11.99, 150.0);
	private movie2 = new Movie("Holes", "A movie starring Shia Lebouff", 11.99, 120.00);
	private movie3 = new Movie("Jaws", "A movie starring a mechanical shark", 9.99, 130.00);
	
	// Adding movies to movieStock ArrayList
	movieStock.add(movie1);
	movieStock.add(movie2);
	movieStock.add(movie3);
	
	// Adding movieStock to stock ArrayList
	stock.add(movieStock);
	
	// Creating an ArrayList cdStock for CDs in stock
	private ArrayList<CD> cdStock = new ArrayList<CD>(maxInventory);
	
	// Creating movies to stock the movieStock ArrayList
	private cd1 = new CD("The Wall", "Pink Floyd", 14.99, 26);
	private cd2 = new CD("Back in Black", "AC/DC", 14.99, 10);
	private cd3 = new CD("Thriller", "Michael Jackson", 14.99, 9);
	
	// Adding CDs to cdStock ArrayList
	cdStock.add(cd1);
	cdStock.add(cd2);
	cdStock.add(cd3);
	
	// Adding cdStock to stock ArrayList
	stock.add(cdStock);
	
	// Creating an ArrayList bookStock for CDs in stock
	private ArrayList<Book> bookStock = new ArrayList<Book>(maxInventory);
	
	// Creating movies to stock the movieStock ArrayList
	private book1 = new Book("The Divine Comedy", "Dante Alighieri", 19.99, 712);
	private book2 = new Book("Moby Dick", "Herman Melville", 11.99, 585);
	private book3 = new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams", 6.99, 208);
	
	// Adding CDs to cdStock ArrayList
	bookStock.add(book1);
	bookStock.add(book2);
	bookStock.add(book3);
	
	// Adding cdStock to stock ArrayList
	stock.add(bookStock);
	
	// Creating an ArrayList meatStock for meat in stock
	private ArrayList<Meat> meatStock = new ArrayList<Meat>(maxInventory);
	
	// Creating different meats to stock the meatStock ArrayList
	private meat1 = new Meat("Ground Beef", "All Natural* 93% Lean/7% Fat Lean Ground Beef Roll", 4.77, 1);
	private meat2 = new Meat("Chicken Breast", "Foster Farms Family Pack of Boneless Skinless "
			+ "Chicken Breast", 9.69, 3);
	private meat3 = new Meat("Ground Beef Patty", "All Natural* 85% Lean/15% Fat "
			+ "Angus Steak Patties 12 Count", 16.48, 4);
	
	// Adding meat to meatStock ArrayList
	meatStock.add(meat1);
	meatStock.add(meat2);
	meatStock.add(meat3);
	
	// Adding meatStock to stock ArrayList
	stock.add(meatStock);
	
	// Creating fruitStock 
	private ArrayList<Fruit> fruitStock = new ArrayList<Fruit>(maxInventory);
	
	// Creating different fruits to stock the fruitStock ArrayList
	private fruit1 = new Fruit("Strawberries", "Stem Strawberries", 3.34, 2);
	private fruit2 = new Fruit("Oranges", "Navel Oranges", 6.48, 5);
	private fruit3 = new Fruit("Peaches", "Organic Peaches", 4.29, 2);
	
	// Adding fruits to fruitStock ArrayList
	fruitStock.add(fruit1);
	fruitStock.add(fruit2);
	fruitStock.add(fruit3);
	
	// Adding fruitStock to stock ArrayList
	stock.add(fruitStock);
	
	// Creating vegetableStock
	private ArrayList<Vegetable> vegetableStock = new ArrayList<Vegetable>(maxInventory);
	
	// Creating vegetables to stock the vegetableStock ArrayList
	private vegetable1 = new Vegetable("Carrots", "Peeled Baby-Cut Carrots", 1.84, 2);
	private vegetable2 = new Vegetable("Sweet Potatoes", "Sweet Potato Bag", 3.19, 3);
	private vegetable3 = new Vegetable("Bell Peppers", "Sweet Mini Peppers Bag", 2.98, 1);
	
	// Adding vegetables to vegetableStock ArrayList
	vegetableStock.add(vegetable1);
	vegetableStock.add(vegetable2);
	vegetableStock.add(vegetable3);
	
	// Adding vegetableStock to stock ArrayList
	stock.add(vegetableStock);
	
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
		for(int i = 0; i < stock.size();i++) {
			
			for (int j = 0; j < stock.get(i).size(); j++)
			
			{
				System.out.print(stock.get(i).get(j).toString());
			}
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
