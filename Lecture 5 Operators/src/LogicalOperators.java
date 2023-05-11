public class LogicalOperators {
    public static void main(String[] args) {
        int p=15, q=10 ,r=5;
        //&& operator
        System.out.println(p<q && p>r); //false
        System.out.println(p>q && p>r); //true
        //|| operator
        System.out.println(p<q || p>r); //true
        System.out.println(p<q || p>r); //true
        //! operator
        System.out.println(!(p>q)); //answer is true , it will return false
        System.out.println(!(p<q)); //answer is false, it will return true
    }
}
