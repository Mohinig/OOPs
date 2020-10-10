public class Student extends Person {
    public String hobby="Facebook";
    Student(String name)
    {
        super(name);
    }
    public String introduce() {
        return "Hello, my name is "+this.getName()+" ,I am a CSE student at IEM and my hobby is using "+this.hobby;
    }
}
