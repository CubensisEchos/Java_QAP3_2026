public class Ellipse extends Shape
{
    private double width;
    private double height;

    //constructor
    public Ellipse(String name, double width, double height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }

    //get & set stuff
    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    //math
    @Override
    public double area()
    {
        return Math.PI * width * height;
    }

    @Override
    public double perimeter()
    {
        return 2 * (width + height);
    }

    //scale from scalable
    @Override
    public void scale(double factor)
    {
        width *= factor;
        height *= factor;
    }

    //toString
    @Override
    public String toString()
    {
        return super.toString() + " (Width: " + width + ", Height: " + height + ")";
    }
}
