import java.util.Scanner;
import java.util.Arrays;
class Array_input_Print
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter 5 numbers ");
    for(int i=0;i<5;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.print("Elements of Array are : ");
     for(int j=1;j<5;j++)
     {
        System.out.println(a[j]);
     }
    }
}