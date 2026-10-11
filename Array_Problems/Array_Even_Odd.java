import java.util.Scanner;

public class Array_Even_Odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements in Array");
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("The number of Even Elements are : "+even);
        System.out.println("The number of odd Elements are : "+odd);

    }
}
