import java.util.*;
class person
{
	String name,gender,address;
	int age;
	person(String n,String gen,String addr,int ag)
	{
		this.name=n;
		this.gender=gen;
		this.address=addr;
		this.age=ag;
	}
}
class employee extends person
{
	int empid;
	double salary;
	String cname,quali;
	employee(String n,String gen,String addr,int ag,int eid,double sal,String cmpname,String qual)
	{
		super(n,gen,addr,ag);
		this.empid=eid;
		this.salary=sal;
		this.cname=cmpname;
		this.quali=qual;
	}
}
class teacher extends employee
{
	String subject,dept;
	int tchrid;
	teacher(String n,String gen,String addr,int ag,int eid,double sal,String cmpname,String qual,String sub,String dep,int tid)
	{
		super(n,gen,addr,ag,eid,sal,cmpname,qual);
		this.subject=sub;
		this.dept=dep;
		this.tchrid=tid;	
	}
	void display()
	{
		System.out.println("Teacher name : "+this.name);
		System.out.println("Teacher gender : "+this.gender);
		System.out.println("Teacher address : "+this.address);
		System.out.println("Teacher age : "+this.age);
		System.out.println("Employee id : "+this.empid);
		System.out.println("Company name : "+this.cname);
		System.out.println("Employee qualification : "+this.quali);
		System.out.println("Employee salary : "+this.salary);
		System.out.println("Teacher id : "+this.tchrid);
		System.out.println("Teacher subject : "+this.subject);
		System.out.println("Teacher department : "+this.dept);
	}
}
public class person_inheritance
{
	public static void main(String args[])
	{
		String name,gender,addr,cname,qual,sub,dept;
		int age,empid,tid,n;
		double salary;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of teachers : ");
		n=s.nextInt();
		teacher obj[]=new teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Teacher "+(i+1));
			System.out.println("Enter the teacher id : ");
			empid=s.nextInt();
			s.nextLine();
			System.out.println("Enter the teacher name : ");
			name=s.nextLine();
			System.out.println("Enter the teacher gender : ");
			gender=s.nextLine();
			System.out.println("Enter the teacher address : ");
			addr=s.nextLine();
			System.out.println("Enter the teacher age : ");
			age=s.nextInt();
			s.nextLine();
			System.out.println("Enter the teacher name : ");
			cname=s.nextLine();
			System.out.println("Enter the teacher qualification : ");
			qual=s.nextLine();
			System.out.println("Enter the teacher salary : ");
			salary=s.nextDouble();
			System.out.println("Enter the teacher id : ");
			tid=s.nextInt();
			s.nextLine();
			System.out.println("Enter the teacher subject : ");
			sub=s.nextLine();
			System.out.println("Enter the teacher department : ");
			dept=s.nextLine();
			obj[i]=new teacher(name,gender,addr,age,empid,salary,cname,qual,sub,dept,tid);	
		}
		System.out.println("-----TEACHER DETAILS-----\n");
		for(int i=0;i<n;i++)
		{
			System.out.println("Teacher "+(i+1));
			obj[i].display();
		}
	}
}