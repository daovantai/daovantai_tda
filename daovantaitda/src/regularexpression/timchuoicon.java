package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class timchuoicon {
    public static void main(String[] args) {
        String text1="TDA thanh lap ngay 08/01/2020,onboard ngay 23/11/2022";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}"); // mau dinh dang regex
        Matcher matcher= pattern.matcher(text1); // tao 1 lop matcher khop dau vao voi mau
        while (matcher.find()){
            System.out.println(text1.substring(matcher.start(),matcher.end()));
        }
        String text2="23/09/2001";
        String text3="24/11/20221";
        Pattern pattern1 = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
        System.out.println("chuoi text2 co dinh dang ngay thang: " + pattern1.matcher(text2).matches());
        System.out.println("chuoi text3 co dinh dang ngay thang: "+ pattern1.matcher(text3).matches());
    }
}
