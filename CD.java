package Project3_Store;

public class CD extends Item {
	private int trackCount;

	public int getTrackCount()
	{
		return trackCount;
	}

	public void setTrackCount(int newTrackCount)
	{
		this.trackCount = newTrackCount;
	}

	@Override
	public String toString() 
	{
		return "Title: " + title + "\nPrice: $" + price +"\nDescription: "
				+ description + "\nTrack Count: " + trackCount + "\n";
	}

}
