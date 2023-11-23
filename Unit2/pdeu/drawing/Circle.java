package pdeu.drawing;
public class Circle extends Shape implements Resizeable
{
    double radius;

    public Circle()
    {
        super();
        radius = 0;
    }

    public Circle(String color, String pattern, double radius)
    {
        super(color, pattern);
        this.radius = radius;
    }

    public double calculateArea()
    {
        return (2*3.14*radius);
    }

    public double calculatePerimeter()
    {
        return (3.14*radius*radius);
    }

    public void resize(int radius)
    {
        this.radius = radius;
    }
    
}

