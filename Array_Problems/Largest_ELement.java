import java.util.Scanner;
class Largest_Element {
    int largest(int n,int a[])
    {
        int max=0;
        for(int i=0;i<n;i++)
        { if(a[i]>max)
            max=a[i];
        }
        return max;
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
        Largest_Element l1=new Largest_Element();
        System.out.println("Largest element from Array is "+l1.largest(n, a));
    }
}
