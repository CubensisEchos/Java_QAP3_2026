public class Demo
{
    public static void main(String[] args)
    {
        //person
        Person leon = new Person("Leon Kennedy", 49, "M");
        System.out.println(leon);

        //student
        Student victor = new Student("Victor Wembanyama", 22, "M", "SPU2023", 4.0);
        System.out.println(victor);

        //teacher
        Teacher mrSterling = new Teacher("Donald Sterling", 71, "M", "Business", 70000);
        System.out.println(mrSterling);

        //college student
        CollegeStudent steve = new CollegeStudent("Steve Nash", 32, "M", "PHX2011", 3.9, "Sociology", 3);
        System.out.println(steve);
    }
}
