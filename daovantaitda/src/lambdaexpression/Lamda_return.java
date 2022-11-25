package lambdaexpression;
interface Addable{
    int add(int a,int b);
}


public class Lamda_return {
    public static void main(String[] args) {
        Addable ad1= (a, b) -> (a+b); // ko su dung tu khoa return
        System.out.println(ad1.add(5,6));
        Addable ad2= (a, b) -> {
            return a+b;                // su dung tu khoa return
        };
        System.out.println(ad2.add(7,8));
    }
}
