import java.util.Scanner;
class wave
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 int d,i,j=0,temp=0;
	 System.out.println("Enter the Number");
	 d=sc.nextInt();
	 int []a = new int[10];
    for( i=0;i<d;i++)
     {
        a[i]=sc.nextInt();
     }
      for(i=0;i<d;i=i+2)
     {
      for(j=i+1;j<=i+1;j++) 
      { 
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
     }
     }
           
    System.out.print("waveform is:- ");     
     for( i=0;i<d;i++)
     {
         System.out.print(a[i]+" ");
     }

	}
}