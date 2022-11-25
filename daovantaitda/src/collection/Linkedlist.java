package collection;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;// gói java.util chứa tất cả các lớp interface của collection
import java.util.List;
public class Linkedlist {
    public static void main(String[] args) {
        // so sanh ArrayList va LinkedList
        ArrayList<String> list1= new ArrayList<>();
        LinkedList<String> list2= new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.remove(2);
        list1.remove(2);
        System.out.println(list1.get(2));
        System.out.println(list2.get(2));
        System.out.print("arraylist: ");
        for(String s:list1){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("linkedlist: ");
        for(String a:list2 ){
            System.out.print(a+" ");
        }
        System.out.println();
        list2.retainAll(list1);// xoa nhung phan tu khong thuoc list 1 khoi list 2
        System.out.println(list2);
        //the cac phan thu cua list1 vao list2
        list2.addAll(list1);
        System.out.println(list2);
        //truy cap phan tu trong LinkedList
        System.out.println(list2.get(3));
        //cap nhat gia tri phan tu theo index
        list2.set(0,"tb");
        System.out.println(list2);
        //xoa phan thu theo index
        list2.remove(1);
        System.out.println(list2);
        // tim kiem vi tri xuat hien dau tien cua 1 phan tu trong LinkedList
        System.out.println(list2.indexOf("2"));
        // tim kiem vi tri xuat hien cuoi cung cua 1 phan tu
        System.out.println(list2.lastIndexOf("4"));
        // chuyen doi LinkedList sang Array bang toArray()
        Object[] arr= list2.toArray();

    }
}
