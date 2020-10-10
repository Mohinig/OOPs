public class Person {
    public String hobby="Reading";
    private String name;
    Person(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public String introduce()
    {
        return "Hello, my name is "+this.getName()+" and my hobby is "+this.hobby;
    }

}
