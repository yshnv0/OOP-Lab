import java.util.*;

public class rectangle
{
	int l,b;
	rectangle(int x,int y)
	{
		l=x;
		b=y;
	}
	void area()
	{
		System.out.println("Area = "+l*b);
		System.out.println("Perimeter = "+2*(l+b));
	}
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter length of 1st rectangle");
		int a=x.nextInt();
		System.out.println("Enter breadth of 1st rectangle");
		int b=x.nextInt();
		System.out.println("Enter length of 2nd rectangle");
		int c=x.nextInt();
		System.out.println("Enter breadth of 2ndrectangle");
		int d=x.nextInt();
		rectangle r1=new rectangle(a,b);
		rectangle r2=new rectangle(c,d);
		System.out.println("Area & Perimeter of 1st rectangle");
		r1.area();
		System.out.println("Area & Perimeter of 2ndrectangle");
		r2.area();
	}
		
}