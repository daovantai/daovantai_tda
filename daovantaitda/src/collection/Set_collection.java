package collection;

import java.util.*;

/// trong interface collection Set duoc trien khai boi HashSet,LinkedHashSet,TreeSet
public class Set_collection {
    public static void main(String[] args) {
        //khai bao
        Set<String> setA = new HashSet<>();
        //them phan tu vao Set dung phuong thuc add()
        setA.add("Java");
        setA.add("Python");
        setA.add("PHP");

        Set<String> setB= new HashSet<>();
        setB.add("C++");
        setB.add("Golang");
        setB.add("Java");
        setA.addAll(setB);// them cac phan tu setB khong co trong setA vao setA
        System.out.println(setA);
        System.out.println("so phan tu trong setA:" + setA.size());
        System.out.println(setA.contains("Java")); //ham contains de kiem tra trong su ton tai object trong Set
        //duyet Set su dung vong lap for
        for(String s : setA){
            System.out.println(s);
        }
        // xoa phan tu khoi Set bang remove()
        setA.remove("Golang");
        // phan tu cua setA sau khi xoa
        System.out.println(setA);

        // chuyen doi Set thanh List bang cach tao List va goi addAll()
        List<String> listA= new ArrayList<>();
        listA.addAll(setA); // chuyen setA thanh listA

        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("2");
        hashSet.add("3");
        System.out.println(hashSet);

        //TreeSet sau khi bo cac phan tu trung lap se tu sap xep
        Set<String> treeSet= new TreeSet<>();
        treeSet.add("3");
        treeSet.add("Java");
        treeSet.add("6");
        treeSet.add("Pyhthon");
        treeSet.add("C++");
        treeSet.add("1");
        System.out.println(treeSet);
    }
}
