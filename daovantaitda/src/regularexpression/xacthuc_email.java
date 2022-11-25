package regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class xacthuc_email {
    public static void main(String[] args) {
        String email_pattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap Email");
        String mail= sc.nextLine();
        if(Pattern.matches(email_pattern,mail)==true){
            System.out.println("nhap dung email");
        }
        else {
            System.out.println("nhap sai email");
        }
    }

}
