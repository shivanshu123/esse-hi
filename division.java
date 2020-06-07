import java.util.Scanner;
class sum
{
	public static void main(String []arg)
	{
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int sum=0;
		if(b!=0)
		{	sum=a/b;
			System.out.println("Division "+sum);}
		else
			System.out.println("Division Operation is not possible");	
	}
}
