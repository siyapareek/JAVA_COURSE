public class Count_the_occurence {
    public static void main(String[] args) {
        int[] num={1,3,4,6,7,8,2,4,6,8,9};
        int x=4;
        int count=0;
        for(int i=0;i<num.length;i++){
            if (num[i] == x) {
                count++;
            }

        }
        System.out.println(count);
    }

}
