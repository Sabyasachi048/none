package Shape;

public class Rectangle extends quadrilateral{
	public Rectangle(double a, double b)
	{
		l = a;
		w = b;
	}
	public double area()
	{
		return l*w;
	}
}
