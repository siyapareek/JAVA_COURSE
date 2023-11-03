import java.util.Scanner;
public class a_power_b {
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt(),b= sc.nextInt();
    int ans=1;

    for(int i=1;i<=b;i++){
        ans*=ans;
        System.out.println(ans);
    }
}
