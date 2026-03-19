public class Demo
{
    public static void main(String[] args)
    {
        MovablePoint movePoint = new MovablePoint(2.0f, 4.0f, 2.5f, 4.5f);

        System.out.println("Initial point: " + movePoint);

        movePoint.move();
        System.out.println("After first movement: " + movePoint);

        movePoint.move();
        System.out.println("After second movement: " + movePoint);

        movePoint.setSpeed(2.0f, -1.0f);
        movePoint.move();
        System.out.println("After speed change and movement: " + movePoint);
    }
}
