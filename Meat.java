package Project3_Store;

public class Meat extends Item {

    private int weightCount;

    public Meat(String t, String des, double p, int weight) {
        super(t,des,p);
        this.weightCount = weight;
    }

    public int getweightCount()
    {
        return weightCount;
    }

    public void setweightCount(int newweightCount)
    {
        this.weightCount = newweightCount;
    }

    @Override
    public String toString()
    {
        return "Title: " + title + "\nPrice: $" + price +"\nDescription: "
                + description + "\nWeight Count: " + weightCount + "lb\n";
    }
}