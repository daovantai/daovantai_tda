package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_api {
    public static void main(String[] args) {
        List<NhanVien> list= new ArrayList<>();
        list.add(new NhanVien("tai",2000,"DD1"));
        list.add(new NhanVien("manh",2000,"DD1"));
        list.add(new NhanVien("ngoc",3000,"GA"));
        list.add(new NhanVien("amanh",9000,"DD1"));
        list.add(new NhanVien("tai",8000,"DD2"));
        list.add(new NhanVien("tai",8000,"DD1"));
        double a= tongluong(list);
        System.out.println(a);
        double b= tongluong2(list);
        System.out.println(b);
        double c=luong(list);
        System.out.println(c);

        // StreamMap
        Stream<String> name= Stream.of("java","python","php");
        System.out.println(name.map(s -> { // map de anh xa moi phan tu cua stream sang gia tri tuong ung
            return s.toUpperCase();
        }).collect(Collectors.toList()));

        // vi du ve streamMax tim nhan vien co luong cao nhat
        System.out.println(list.stream().max(Comparator.comparing(NhanVien::getLuong)).get().getName());

        // streamfind
        List<String> liststring= Arrays.asList("A","B","C","E","N","A","C");
        System.out.println(liststring.stream().findAny().get());
        System.out.println(liststring.stream().findFirst().get());
        //Streamdistinct tra ve cac phan tu rieng biet
        liststring.stream().distinct().forEach(s -> System.out.print(s));
    }

    // ko su dung StreamAPI
    public static double tongluong2(List<NhanVien> list){
        double cout=0;
        for(NhanVien n: list){
            if(n.getMaphong().equals("DD1")){
                cout+=n.getLuong();
            }
        }
        return cout ;

    }
    //tinh tong luong nhan vien cua phong DD1
    public static double tongluong(List<NhanVien> listEmployee) {  // su dung StramAPI
        return listEmployee.stream().filter(p -> p.getMaphong().equals("DD1"))  // trong filter la dieu kien de loc
                .mapToDouble(p -> p.getLuong()).sum();
    }


    public static double luong(List<NhanVien> list){
        return list.stream().filter(p -> p.getMaphong().equals("DD1") && p.getName().equals("tai") )
                .mapToDouble(value -> value.getLuong()).sum();

    }






}
