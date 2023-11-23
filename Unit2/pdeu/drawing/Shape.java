package pdeu.drawing;

public abstract class Shape
{
    public String color;
    public String pattern;
    static int count = 0;

    {
        count++;
    }

    public Shape()
    {
        color  = "Null";
        pattern = "Null";
    }

    public Shape(String color, String pattern)
    {
        this.color = color;
        this.pattern = pattern;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public static int countShapes()
    {
        return count;
    }

}

