class shape
{
    private String color="red";
    public shape()
    {}
    public shape(String color)
    {
        this.color=color;
    }
    public String getcolor()
    {
        return this.color;
    }
    public String getDesc()
    {
        return "I am a shape of color "+ this.getcolor();
    }
    
}