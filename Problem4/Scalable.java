public interface Scalable
{
    public abstract void scale(double factor);

    default void displayScalable()
    {
        System.out.println("This object is scalable");
    }

    public static void staticInfo()
    {
        System.out.println("Scaling changes the size of the object by given factor");
    }
}
