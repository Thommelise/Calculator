import java.util.Scanner;

public class Rectangle {

    // Her defineres length og width som tal
    private double length;
    private double width;

    // dette er en constructor den initialisere objektet.
    public Rectangle(double length, double width)
// this. er et argument
    {
        this.length = length;
        this.width = width;

    }

    public void setLength(double lenght)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }


    public double getArea()
    {
        return length*width;
    }



}
