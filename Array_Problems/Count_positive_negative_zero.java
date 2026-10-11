import java.util.Scanner;

public class Count_positive_negative_zero {
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
            if(a[i]==0)
                count_zero++;
            else if(a[i]>0)
                count_pos++;
            else
                count_neg++;
        }
        System.out.println("Total Number Positive Elements are : "+count_pos);
        System.out.println("Total Number Negative Elements are : "+count_neg);
        System.out.println("Total Number of zero are : "+count_zero);

    }
}
