package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_collection {
    public static void main(String[] args) {
        HashMap<String,String> hashMap= new HashMap<>();
        // them phan tu su dung put
        hashMap.put("2","Java");
        hashMap.put("1","Python");
        hashMap.put("3","C++");
        hashMap.put("3","PHP");// cap nhat lai gia tri co key=3
        hashMap.put("4","Angular");

        System.out.println(hashMap);
        // get(key) tra ve gia tri phan tu co key da chi dinh
        System.out.println(hashMap.get(2));
        // su dung entrySet() de duyet cac phan tu cua hashMap
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+"-"+ entry.getValue());
        }
        // xoa phan tu theo key
        hashMap.remove(1);
        System.out.println(hashMap);

        Map<String,Student> studentMap= new HashMap<>();
        studentMap.put("1", new Student("tai",21,"nam"));
        studentMap.put("2", new Student("manh",21,"nam"));
        studentMap.put(null, new Student("nhu",18,"nu"));// trong hashSet key co the chua gia tri null
        for(Map.Entry entry: studentMap.entrySet()){
            System.out.println(entry.getKey()+"-"+ entry.getValue());
        }

        // treeMap
        TreeMap<String,String> treeMap= new TreeMap<>();
        treeMap.put("b",null);
        treeMap.put("d","Python");
        treeMap.put("a","PHP");
        //treeMap.put(null,"Hm"); treeMap khong the chua key la null
        System.out.println(treeMap);

        //cac phuong thuc con lai giong hashMap
    }
}
