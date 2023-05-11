import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //Swap two numbers without the use of third variable.
        Scanner sc= new Scanner(System.in);
        System.out.println("Write a number x");
        int x=sc.nextInt();
        System.out.println("Write a number y");
        int y=sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.print(x);
        System.out.println(y);
    }
}
