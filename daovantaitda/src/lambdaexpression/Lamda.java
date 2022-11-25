package lambdaexpression;

interface Student{
    void study();

}

public class Lamda {
    public static void main(String[] args) {
        int a=10;
        Student s=() -> {
            System.out.println("hoc Java");
        };
        s.study();
    }
}
