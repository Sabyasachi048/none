package Shape;

public class sphere extends shape3d {
	public sphere(double r)
	{
		l = r;
	}
	public double area()
	{
		return (4/3)*3.141592*l*l*l;
	}
}
