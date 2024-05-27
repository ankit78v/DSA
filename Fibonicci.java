import java.util.Scanner;

public class Fibonicci {
    public static void main(String[] args){
        int fib,j=0,k=1,n;
        System.out.print("Enter tums:");
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        for(int i=1;i<=n;i++)
        {
            fib= k+j;
            j=k;
            k=fib;
            System.out.println(fib);
        }
    }
}
