public class MaximumArray {
    public static void main(String[] args) {
        int[] num={99,2,4,4,8};
        int ans=0;

        for(int i=0;i<num.length;i++){
            if(num[i]>ans){
                ans=num[i];
            }

        }
        System.out.println(ans);
    }

}
