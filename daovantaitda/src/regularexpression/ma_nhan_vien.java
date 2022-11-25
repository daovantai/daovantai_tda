package regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ma_nhan_vien {
    public static void main(String[] args) {
        // ma nhan vien : B19DCCN563,B18DCQT112
        String  id_pattern= "^[B]\\d{2}[D][C][A-Z][A-Z]\\d{3}";
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma nhan vien");
        String ma= sc.nextLine();
        if(Pattern.matches(id_pattern,ma)){
            System.out.println("nhap thanh cong");
        }
        else{
            System.out.println("nhap that bai");
        }
    }
}
