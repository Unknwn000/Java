import java.lang.Math;
class Area
{
    static double area(double side, double base, String shape)
    {
        if (shape.equalsIgnoreCase("triangle"))
        {
            return (side*base)/2;
        }
        else
        {
            System.out.println("Invalid Shape");
        }
        return 1;
        
    }
    static double area(int hight, double wight)
    {
        return hight*wight;
    }
    static double area(double radius)
    {
        return Math.PI * radius * radius;
    }

    public static void main(String[] s)
    {
        double TriangleArea = area(10,10,"triangle");
        System.out.println("The area of the triangle is: " + TriangleArea);

        double RectangleArea = area(10,10);
        System.out.println("The area of the rectangle is: " + RectangleArea);
        
        double CircleArea = area(10);
        System.out.println("The area of the circle is: " + CircleArea);
    }
 
}

