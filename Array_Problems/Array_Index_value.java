import java.util.Scanner;
public class Array_Index_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements in Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Index : "+i+" Element "+a[i]);
        }
    }
}
