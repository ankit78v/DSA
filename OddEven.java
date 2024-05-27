import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
    {
        int x,num;
        do {
            System.out.print("Enter a Number:");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if (num % 2 == 0) {
                System.out.println("Number is Even:" + num);
            } else {
                System.out.println("Number is Odd:" + num);
            }
            System.out.print("Again Enter 1:");
            x= in.nextInt();
        }while(x==1);
    }
}
