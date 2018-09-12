import java.util.Scanner;

public class Area {

    public static void main(String[] args)
    {

        var rect = new Rectangle(20,20);
        System.out.println(rect.getArea());

        var tri = new Triangle(10,10,22 );

        System.out.println(tri.getArea());

        var cirkel = new Cirkel(4);

        System.out.println(cirkel.getArea());
    }
}
