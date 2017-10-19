package Shape;

public class Righttriangle extends triangle {
	public Righttriangle(double a, double b)
	{
		l=a;
		w=b;
	}
	public double area()
	{
		return 0.5*l*w;
	}
}
