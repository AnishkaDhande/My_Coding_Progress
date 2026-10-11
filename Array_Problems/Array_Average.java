import java.util.Scanner;
public class Array_Average {
    public static void main(String[] args) 
    {
    double average=0;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of an Array ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+" Elements in Array ");
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        sum=sum+a[i];
      }
      average=sum/n;
      System.out.println("Average of All elements in Array is "+average);

    }
}