import java.util.Scanner;
class even
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int d;
	System.out.println("Enter the Number:- ");
	d=sc.nextInt();
	int i;
	for(i=1;i<=d;i++)
	{
	   if(i%2==0)
	   {
	   System.out.println(i+" is Even Number");
	   }
	}
	}
}