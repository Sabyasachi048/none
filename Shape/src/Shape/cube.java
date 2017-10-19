package Shape;

public class cube extends shape3d{
	public cube(double a)
	{
		l = a;
	}
	public double area()
	{
		return l*l*l;
	}
}
