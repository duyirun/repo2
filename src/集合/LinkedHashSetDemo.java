package 集合;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String>set =new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        //说明LinkedHashSet取出元素为有序；
    }
}
