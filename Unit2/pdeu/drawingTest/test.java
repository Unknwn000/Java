package pdeu.drawingTest;
import pdeu.drawing.*;

public class test 
{
    static void highestArea(Shape[] sp)
    {
        int max = 0;
        for(int i =0; i<sp.length; i++)
        {
            if(sp[i].calculateArea() > sp[max].calculateArea())
            {
                max = i;
            }
        }
        System.out.println("\nThe shape with highest area's details are: ");
        System.out.println("Colour :" + sp[max].color);
        System.out.println("Pattern : " + sp[max].pattern);
    }

    static void ResizeableShapes(Shape[] sp)
    {
        for(int i=0; i<sp.length; i++)
        {
            if(sp[i] instanceof Resizeable)
            {
                System.out.println("\nThe shape which allows resizeable facility's details are: ");
                System.out.println("Colour :" + sp[i].color);
                System.out.println("Pattern : " + sp[i].pattern);
            }
        }
    }

    static double totalDecorativMaterialForCircle(Shape[] sp)
    {
        double totalmaterial = 0;
        for(int i=0; i<sp.length; i++)
        { 
            if(sp[i] instanceof Circle)
            {
                totalmaterial += sp[i].calculatePerimeter();
            }
        }
        return totalmaterial;
    }
    public static void main(String[] args) 
    {
        Shape s1 = new Triangle("black", "equilator", 5.0, 10.0);
        Shape s2 = new Circle("white", "equilator", 5.0);
        Shape s3 = new Rectangle("red", "equilator", 5.0, 10.0);
        Shape s4 = new Square("green", "equilator", 10.0);
        
        Shape[] shapes = {s1, s2, s3, s4};

        System.out.println("Total number of shapes created are: " + Shape.countShapes());

        highestArea(shapes);

        ResizeableShapes(shapes);

        double x = totalDecorativMaterialForCircle(shapes);
        System.out.println("\n" + x);
    }
}
