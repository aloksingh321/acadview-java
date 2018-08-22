import java.util.Scanner;
class max
{
 public void insert(int a[],int n)
  {
  Scanner sc= new Scanner(System.in);
  int i,max,max1;
  for(i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
max=0;
max1=0;
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  }
  for(i=0;i<n;i++)
  {
  if(a[i]>max1 && a[i]<max)
  {
     max1=a[i];
  }
  }
  System.out.print("second largest no is:- "+max1);
}
}
class main
{
	public static void main(String args[])
	{
   Scanner sc= new Scanner(System.in);
   int d;
   d=sc.nextInt();
   int []a= new int[d];
   max x= new max();
  x.insert(a,d);


	}
}