public class EquilateralTriangle extends Triangle
{
    //constructor
    public EquilateralTriangle(String name, double side)
    {
        super(name, side, side, side);
    }

    //scale from scalable
    @Override
    public void scale(double factor)
    {
        super.scale(factor);
    }

    //toString
    @Override
    public String toString()
    {
        return super.toString() + " (Equilateral)";
    }
}
