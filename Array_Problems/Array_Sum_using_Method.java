import java.util.Scanner;
public class Array_Sum_using_Method {
    int arraySum(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
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
       Array_Sum_using_Method a1=new Array_Sum_using_Method(); 
       System.out.println("Sum Array elements are "+a1.arraySum(a, n));
    }
}
