import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        //i) both the conditions 'a < 50' and 'a < b' are true.
        //ii) at least one of the conditions 'a < 50' or 'a < b' is true.
        int a=55,b=70;
        // i)
        System.out.println(a<50 && a<b);
        //ii)
        System.out.println(a<50 || a<b);

    }
}
