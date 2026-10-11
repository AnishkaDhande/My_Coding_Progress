import java.util.Scanner;
import java.util.Arrays;
public class Array_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of an array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter "+n+" Elements in Array ");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          //b[(n-1)-i]=a[i];//we can store the reverse array int here also
        }
       for(int i=0;i<n;i++)
       {
         b[(n-1)-i]=a[i];
       }
       System.out.println("Elements of array Reverse order");
       for(int i=0;i<n;i++)
       {
        System.out.print(b[i]+" ");
       }
    }
}
