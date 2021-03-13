package 集合;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<student> list = new java.util.ArrayList<student>();
        student stu1 = new student("杭三", 12);
        student stu2 = new student("张三", 16);
         list.add(stu1);
         list.add(stu2);
         list.add(stu1);
         list.add((stu2));
         list.add(0,stu2);
        student xaoming = list.remove(2);
        list.remove(stu1);
        int a=list.size();
        boolean de=list.isEmpty();
        boolean ee=list.contains(stu2);

        System.out.println(list);
        System.out.println(a);
        System.out.println(de);
        System.out.println(ee);

    }
}
