import java.util.Scanner;

public class Reverse {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int ReverseNum=0;

            while(n>0){
                ReverseNum=ReverseNum*10+n%10;
                n/=10;


            }
            System.out.println("reverse of the number is " + ReverseNum);
        }
    }



