public class Demo
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle("Circle1", 5);
        shapes[1] = new Ellipse("Ellipse1", 4, 6);
        shapes[2] = new Triangle("Triangle1", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 4);
        shapes[4] = new Circle("Circle2", 4);
        shapes[5] = new Triangle("triangle2", 6, 7, 8);

        //loop
        for(Shape side : shapes)
        {
            System.out.println(side);
        }
    }
}
