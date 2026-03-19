public class Triangle extends Shape
{
    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle(String name, double side1, double side2, double side3)
    {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //get & set stuff
    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    //math
    @Override
    public double area()
    {
        double side = perimeter() / 2;
        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    }

    @Override
    public double perimeter()
    {
        return side1 + side2 + side3;
    }

    //scale from scalable
    @Override
    public void scale (double factor)
    {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    //toString
    @Override
    public String toString()
    {
        return super.toString() + " (Sides: " + side1 + ", " + side2 + ", " + side3 + ")";
    }
}
