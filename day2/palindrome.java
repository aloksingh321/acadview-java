import java.util.Scanner;
class rev
{
	public static void main(String args[])
	{
	int a,t=0,y=0;
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	int d=a;
	while(a!=0)
	{
	t=a%10;
	y=y*10+t;
	a=a/10;
	}
if(d==y)
{
System.out.println("palindrome number "+d );
}
else
{
	System.out.println("not a palindrome number "+d );
}
}
}