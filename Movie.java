package Project3_Store;

public class Movie extends Item {
	
	private double movieLength;
	
	// Movie constructor
	public Movie(String t, String des, double p, double length) {
		this.title = t;
		this.description = des;
		this.price = p;
		this.movieLength = length;
	}

	public double getMovieLength()
	{
		return movieLength;
	}

	public void setMovieLength(double newMovieLength)
	{
		this.movieLength = newMovieLength;
	}

	@Override
	public String toString() 
	{
		String s = "\"Title: \" + title + \"\\nPrice: $\" + price +\"\\nDescription: \"\n" + 
				"				+ description + \"\\nMovie Length: \" + movieLength + \" minutes\\n\";";
		return  s;
	}
}
