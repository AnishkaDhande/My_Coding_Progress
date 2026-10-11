import java.util.Scanner;
import java.util.Arrays;
public class Array_Element_Searching {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements in Array");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("Enter the Number you Want to Search");
        int s=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
               { 
                  index =i;
                  break;
               }
        }
        if(index==-1)
        {
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element Found at "+(index+1)+" Position");
        }
       
    }
}
