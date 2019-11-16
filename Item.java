package Project3_Store;

public class Item {
	int id;
	String title;
	String description;
	double price;

	public Item(String t, String des, double p) {
		id =+ 1;
		this.title = t;
		this.description = des;
		this.price = p;
	}
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String newDescription)
	{
		this.description = newDescription;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double newPrice)
	{
		this.price = newPrice;
	}
	public String toString() 
	{
		String s = "\nTitle:" + getTitle() + "\nPrice: $ "+ getPrice() +"\nDescription: "+getDescription();
		return  s;
	}
}
