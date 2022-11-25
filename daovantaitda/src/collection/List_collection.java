package collection;

import java.util.ArrayList;
import java.util.List;

public class List_collection {
    public static void main(String[] args) {
        Student s1= new Student("tai",21,"nam");
        Student s2= new Student("manh",21,"nam");
        Student s3= new Student("ngoc", 22,"nu");
        Student s4= new Student("nhu", 18,"nu");

        List<Student> listStudent=  new ArrayList<>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        for(Student s:listStudent){
            System.out.println(s.toString()+" ");
        }
        System.out.println(listStudent.get(2).toString());

    }
}
