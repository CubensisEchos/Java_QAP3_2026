public class Circle extends Shape
{
    private double radius;

    //constructor
    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }

    //get & set stuff
    public double getRadius()
    {
        return radius;
    }

    //Math
    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    //scale from scalable
    @Override
    public void scale(double factor)
    {
        radius *= factor;
    }

    //toString
    @Override
    public String toString()
    {
        return super.toString() + " (Radius: " + radius + ")";
    }
}
