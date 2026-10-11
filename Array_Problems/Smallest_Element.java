import java.util.Scanner;

public class Smallest_Element {
    int smallest(int a[],int n)
    {
        int  min=a[0];
     for(int i=0;i<n;i++)
     {  
         if(a[i]<min)
             min=a[i];
     }
     return min;
    }
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n=sc.nextInt();
        int count_pos=0,count_neg=0,count_zero=0;
        int a[]=new int[n];
        System.out.println("Enter Elements in Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Smallest_Element l1=new Smallest_Element();
        System.out.println("Smallest element from Array is "+l1.smallest(a,n));
    }
}
