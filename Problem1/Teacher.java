public class Teacher extends Person
{
    protected String mySubject;
    protected double mySalary;

    //constructor
    public Teacher(String name, int age, String gender, String subject, double salary)
    {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    //get & set stuff
    public String getSubject()
    {
        return mySubject;
    }
    public void setSubject(String subject)
    {
        this.mySubject = subject;
    }

    public double getSalary()
    {
        return mySalary;
    }
    public void setSalary(double salary)
    {
        this.mySalary = salary;
    }

    //toString
    @Override
    public String toString()
    {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
}
