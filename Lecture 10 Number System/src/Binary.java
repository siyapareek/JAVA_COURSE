import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary_number=sc.nextInt();
        int ans=0;
        int pw=1;

        while(binary_number>0){
            int unit_digit=binary_number%10;
            ans=ans+(unit_digit*pw);
            binary_number=binary_number/10;
            pw=pw*2;
        }
        System.out.println(ans);

    }
}
