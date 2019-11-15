package Project3_Store;

public class Customer implements Comparable<Customer> {
	private int id;
	private String firstName;
	private String lastName;
	private ShoppingCart customerPointer;

	public Customer() {
		customerPointer = new ShoppingCart();
	}
	public Customer(int id,String f,String L) {
		this.id = id;
		this.firstName = f;
		this.lastName = L;
		customerPointer = new ShoppingCart();
	}
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String newFirstName)
	{
		this.firstName = newFirstName;
	}

	public String getLastName()
	{
		return firstName;
	}

	public void setLasttName(String newLastName)
	{
		this.lastName = newLastName;
	}

	public double getID()
	{
		return id;
	}

	public void setID(int newID)
	{
		this.id = newID;
	}

	public ShoppingCart getShopingCart()
	{
		return customerPointer;
	}

	public void setShoppingCart(ShoppingCart newCustomerPointer)
	{
		this.customerPointer = newCustomerPointer;
	}

	@Override
	public String toString() 
	{
		return "First Name: " + firstName + "\nLastName: " + lastName +"\nID: "
				+ id + "\nShopping Cart: " + customerPointer.getID() + "\n";
	} 
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if(o.getID() == this.getID()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}

