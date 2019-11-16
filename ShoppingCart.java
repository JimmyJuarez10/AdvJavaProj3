package Project3_Store;

import java.util.ArrayList;

public class ShoppingCart {
	private int capacity = 10;
	private int itemCount = 0;
	private double totalPrice = 0.0;
	private ArrayList<Item> itemsInCart = new ArrayList<Item>(capacity);
	private int id = 0;

	public ShoppingCart() {
		id += 1;

	}
	public void addToCart (Item newItem)
	{
		totalPrice += newItem.getPrice();
		itemsInCart.add(newItem); 
		setTotalPrice(totalPrice);
		itemCount += 1;
		System.out.println("Adding " + newItem.getTitle() + " to cart.");
	}

	public void removeFromCart(Item arrRemoveItem)
	{
		System.out.println("Removing " + arrRemoveItem.getTitle() + " from cart.\n");
		totalPrice -= arrRemoveItem.getPrice();
		setTotalPrice(totalPrice);
		this.itemsInCart.remove(arrRemoveItem);
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void setTotalPrice(double newTotalPrice)
	{
		this.totalPrice = newTotalPrice;
	}

	public int getID()
	{
		return id;
	}

	public void setID(int newId)
	{
		this.id = newId;
	}

	public void showCart()
	{
		for(int i = 0; i < itemsInCart.size(); i++)
		{
			System.out.print(itemsInCart.get(i) + "\n\n");
		}
	}
}
