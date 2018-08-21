import java.util.Scanner;	
class amstrong 
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int d,y,r;
  System.out.println("Enter the Number:- ");
	y=0;
	d=sc.nextInt();
   int s;
   s=d;

   while(d!=0)
   {
     r=d%10;
     y=y+(r*r*r);
     d=d/10;
   }
   if(s==y)
   {
   System.out.println(s+"is Amstrong Number");
   }
   else
   {
   System.out.println("Not a amstrong number");
   }
}
}