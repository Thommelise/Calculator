public class Cirkel {

    private double radius;

    public Cirkel(double radius)
    {this.radius = radius;}

    public void setRadius(double radius)
    { this.radius = radius;}


    public double getRadius() {
        return radius;
    }
    public double getArea() {return Math.pow(radius,2)/Math.PI;}
}
