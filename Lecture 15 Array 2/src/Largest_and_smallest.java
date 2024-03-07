import java.util.Arrays;

public class Largest_and_smallest {
    public static void main(String[] args) {
        int[] num={1,4,5,6,2,3,7,89};
        Arrays.sort(num);
        int[] ans={num[0],num[num.length-1]};
        System.out.println(ans);


    }
}
