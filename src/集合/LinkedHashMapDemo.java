package 集合;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String>map=new LinkedHashMap<>();
        map.put("a","b");
        map.put("c","d");
        map.put("e","f") ;
        System.out.println(map);
        //a元素的取出为有序；
    }
}
