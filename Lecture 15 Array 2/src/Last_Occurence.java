public class Last_Occurence {
    public static void main(String[] args) {
        int[] num={1,2,3,4,8,3,2,1,5};
        int last_index=-1;
        int x=3;

        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                last_index=i;
            }
        }
        System.out.println(last_index);
    }
}
