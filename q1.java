import java.util.Scanner;

//find maximum element of an array
public class q1
{
        public static void main(String args[])
    {
       int n;
        Scanner sc= new Scanner(System.in);
System.out.println("enter how many elements:");
n=sc.nextInt();
int a[]=new int[n], max;
System.out.println("enter elements in array ");
        for(int j=0; j<a.length; j++){
	a[j]=sc.nextInt();
	}
        max=a[0];
        for(int i=0;i<a.length;i++)
        if(a[i]>max)
        {max=a[i];}
        System.out.println("maxim element is "+max);
    }
}