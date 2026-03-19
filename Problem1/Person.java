public class Person
{
    protected String myName;
    protected int myAge;
    protected String myGender;

    //constructor
    public Person(String name, int age, String gender)
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }
    
    //get & set stuff
    public String getName()
    {
        return myName;
    }
    public void setName(String name)
    {
        this.myName = name;
    }

    public int getAge()
    {
        return myAge;
    }
    public void setAge(int age)
    {
        this.myAge = age;
    }

    public String getGender()
    {
        return myGender;
    }
    public void setGender(String gender)
    {
        this.myGender = gender;
    }

    //toString
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}