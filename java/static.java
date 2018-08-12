class A{
	int a;
	 static int b=10;
	A(int n,int m)
	{
		
		int a=n;
		int b=m;
		//int a=n;
		//int b=m;
		int c=a+b;
		System.out.println(this.b);
		System.out.println(c);
		
	}
	
	
}
class Main{
	public static void main(String arg[])
	{
		//System.out.println(b);
		A a=new A(20,100);
		//a.display(20,20);
		//System.out.println(b);
	}
	
}