import java.util.Scanner;
class found 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int d,i,flag=0;
	System.out.println("Enter the number");
	d=sc.nextInt();
	int a[]=new int[d];
	for(i=0;i<d;i++)
	{
       a[i]=sc.nextInt();
	}
    int l;
    l=sc.nextInt();
    for(i=0;i<d;i++)
    {
    	if(a[i]==l)
    	{
         flag=1;
    	}
    }
    if(flag==1)
    {
    	System.out.print("number is present");
    }
    else
    {
    	System.out.print("number is not present");
    }
	}
}