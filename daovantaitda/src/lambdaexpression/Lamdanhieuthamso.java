package lambdaexpression;

import java.util.Scanner;

interface Operation{
    int add(int a, int b);
}

public class Lamdanhieuthamso {
    public static void main(String[] args) {
        Operation operation=(a, b) -> {
            return a+b;
        };
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        int a= sc.nextInt();
        System.out.println("nhap so thu hai: ");
        int b= sc.nextInt();
        System.out.println("tong cua 2 so la: ");
        System.out.println(operation.add(a,b));
    }
}
