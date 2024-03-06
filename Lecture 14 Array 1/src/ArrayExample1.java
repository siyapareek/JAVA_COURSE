class ArrayEXA   {
    void MulArray(){
        int[][] arr={{56,43,6},{34,7,8},{12,56,8}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
    }
    void demoArrays() {
        int[] ages=new int[3];
        String[] name={"siya","ansh","adi"};
        float[] weight=new float[3];
        ages[1]=5;
        ages[2]=79;
        name[0]="hello";
        weight[1]=1;


        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(name[0]);
        System.out.println(weight[1]);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

    }
}
public class ArrayExample1{
    public static void main(String[] args) {
        ArrayEXA obj = new ArrayEXA();
        obj.demoArrays();
        obj.MulArray();



    }
}
