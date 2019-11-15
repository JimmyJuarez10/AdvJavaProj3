package Project3_Store;

public class Movie extends Item {
	private double movieLength;

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
