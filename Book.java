package Project3_Store;

public class Book extends Item {

	private int pageCount;

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
