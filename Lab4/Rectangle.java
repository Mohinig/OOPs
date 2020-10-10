public class Rectangle extends shape {
    private double length=0;
    private double breadth=0;

    public Rectangle(){}
    public Rectangle(String color,double length,double breadth)
    {
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    public double getLength()
    {
        return this.length;
    }

    public double getBreadth()
    {
        return this.breadth;
    }

    public double getArea()
    {
        return this.getLength()*this.getBreadth();
    }

    public String getDesc()
    {
        return "I am a "+ this.getClass() +" of color "+ this.getcolor() +" and length="+this.getLength()+" breadth="+this.getBreadth()+" area="+this.getArea();
    }
}
