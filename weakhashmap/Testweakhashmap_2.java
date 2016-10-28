package test.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
  
public class Testweakhashmap_2 {  
    public static void main(String[] args) throws Exception {  
        Map<Integer,Object> map = new WeakHashMap<>();
        System.gc();
        System.out.println("===========gc:1=============");
        map.put(null,new byte[4*1024*1024]);
        TimeUnit.SECONDS.sleep(5);
        System.gc();
        System.out.println("===========gc:2=============");
        TimeUnit.SECONDS.sleep(5);
        System.gc();
        System.out.println("===========gc:3=============");
        map.remove(null);
        TimeUnit.SECONDS.sleep(5);
        System.gc();
        System.out.println("===========gc:4=============");
    }
}  