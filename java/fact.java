
import java.util.Scanner;
class A
{
	
	public static void main(String arg[]){
		int mul=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
		mul=mul*i;
	}
	
	
	System.out.println("factorial is"+mul);
	}
	
}