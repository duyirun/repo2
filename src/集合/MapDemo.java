package 集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,student> map=new HashMap<>();
        student s1=new student("张三",18);
        student s2=new student("李四",19);
        student s3=new student("王五",20);
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        map.put(1,s3);
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        Iterator<Integer>it=keys.iterator();
        while(it.hasNext())
        {
            Integer key=it.next();
            student tt= map.get(key);
            System.out.println(tt);
        }
        for (Integer ke : keys) {
            student ss = map.get(ke);
            System.out.println(ss);

        }
        student dd = map.remove(1);
        System.out.println(map);


    }
}
