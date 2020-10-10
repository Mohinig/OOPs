public class Circle extends shape {
    private double radius=0;
    Circle(String color,double radius)
    {
        super(color);
        this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return 3.14*this.getRadius()*this.getRadius();
    }

    public String getDesc()
    {
        return "I am a "+ this.getClass() +" of color "+ this.getcolor() +" radius= "+this.getRadius()+" area="+this.getArea();
    }
}
