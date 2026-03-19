public class Student extends Person
{
    protected String myIdNum;
    protected double myGPA;

    //constructor
    public Student(String name, int age, String gender, String idNum, double gpa)
    {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    //get & set stuff
    public String getIdNum()
    {
        return myIdNum;
    }
    public void setIdNum(String idNum)
    {
        this.myIdNum = idNum;
    }

    public double getGPA()
    {
        return myGPA;
    }
    public void setGPA(double gpa)
    {
        this.myGPA = gpa;
    }

    //toString
    @Override
    public String toString()
    {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " +myGPA;
    }
}
