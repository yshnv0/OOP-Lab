import java.util.*;
public class array
{
	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int x=s.nextInt();
		int a[]=new int[x];
		System.out.println("Enter elements of array");
		for(int i=0;i<x;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<x;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}	
}