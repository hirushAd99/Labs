public class Circle {
    private double radius; // Define radius as private variable.
    private String color;  // Define color as private variable.
    public double area;    // Define area variable.
    //final double piValue = 22/7;  // Define pi value as non changing value.

    // Overload constructor.
    public Circle()
    {
        radius = 2;
        color = "White";
    }
    // Constructor build with radius and default color.
    public Circle(double radius)
    {
        this.radius = radius;
        color = "White";
    }
    // Constructor build with user values.
    public Circle(double radius , String color)
    {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }
    public double getArea()
    {
        area = Math.PI*radius*radius;
        return area;
    }
}

