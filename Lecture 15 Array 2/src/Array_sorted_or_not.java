public class Array_sorted_or_not {
    public static void main(String[] args) {
        int[] num={1,2,10,4,5,6,7,8};
        boolean check=true;
        for(int i=1;i<num.length;i++){
            if(num[i]<num[i-1]){
                check=false;
                break;
            }

        }
        System.out.println(check);
    }
}
