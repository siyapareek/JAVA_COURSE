public class Find_the_presence_and_index_of_array {
    public static void main(String[] args) {
        int[] num={1,2,3,4,6,7,8,9,93};
        int ans=-1;
        int x=78;

        for(int i=0;i<num.length;i++){
            if(num[i]==x){
              ans=i;
            }
        }
        System.out.println("found "+x+" at index "+ans);

    }

}
