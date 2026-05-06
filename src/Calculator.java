
public class Calculator {
	int Addition(int a,int b,int c)
	{
		System.out.println("Start of addtion method");
		int sum = a+b+c;
	return sum;	
	}
	void Average (int n1, int n2, int n3 )
	{
		System.out.println("Start of Average method");
		Calculator c1 = new Calculator();
		int res = c1.Addition(n1, n2, n3);
		int avg = res /3;
		System.out.println("Average is "+ avg);
		
		
	}
	
}
