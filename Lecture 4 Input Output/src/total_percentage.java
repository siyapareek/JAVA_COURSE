import java.util.Scanner;

public class total_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks_1=sc.nextInt();
        int marks_2=sc.nextInt();
        int marks_3=sc.nextInt();
        int total=marks_1+marks_2+marks_3;
        int percent=total/3;
        System.out.println("Total marks:"+total);
        System.out.println("Percentage:"+percent);

    }

}
