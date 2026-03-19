public class Ellipse extends Shape
{
    private double a;
    private double b;

    //constructor
    public Ellipse(String name, double axisA, double axisB)
    {
        super(name);
        if (axisA >= axisB)
        {
            this.a = axisA;
            this.b = axisB;
        }
        else
        {
            this.a = axisB;
            this.b = axisA;
        }
    }

    //math
    @Override
    public double getArea()
    {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter()
    {
        if(a == b)
        {
            return 2 * Math.PI * a;
        }
        return Math.PI * Math.sqrt(2 * (a*a + b*b) - (a - b) * (a - b));
    }
}