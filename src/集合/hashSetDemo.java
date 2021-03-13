package 集合;

import java.util.HashSet;
import java.util.Set;

public class hashSetDemo {

    public static void main(String[] args) {
        Set<student>set=new HashSet<student>();
   ;
        student s1=new student("张三",18);
        student s2=new student("李四",19);
        student s3=new student("王五",20);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for (student stu : set) {
            System.out.println(stu);

        }
        int a=set.size();
        boolean b=set.remove(s1);
        boolean c=set.isEmpty();
        boolean d  = set.contains(s1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
