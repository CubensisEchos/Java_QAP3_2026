public abstract class Shape
{
    private String name;

    //constructor
    public Shape(String name)
    {
        this.name = name;
    }

    //get & set stuff
    public String getName()
    {
        return name;
    }

    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    //toString
    @Override
    public String toString()
    {
        return this.name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    }
}