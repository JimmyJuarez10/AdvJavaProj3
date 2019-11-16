package Project3_Store;

public class Book extends Item {

	private int pageCount;
	
	// Book constructor
	public Book(String t, String des, double p, int pageCount) {
		this.title = t;
		this.description = des;
		this.price = p;
		this.pageCount = pageCount
	}

	public int getPageCount()
	{
		return pageCount;
	}

	public void setPageCount(int newPageCount)
	{
		this.pageCount = newPageCount;
	}

	@Override
	public String toString() 
	{
		return "Title: " + title + "\nPrice: $" + price +"\nDescription: "
				+ description + "\nPage Count: " + pageCount + "\n";
	}
}
