package 集合;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.addFirst("hhh");
        System.out.println(list);
        list.addLast("nb");
        System.out.println(list);
        list.push("ddd");
        System.out.println("list");
        String s = list.removeFirst();
        System.out.println(s);
        String h = list.getFirst();
        System.out.println(h);
        String pop = list.pop();
        System.out.println(pop);
        boolean empty = list.isEmpty();
        System.out.println(empty);


    }
}
