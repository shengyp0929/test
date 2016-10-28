package test.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
  
public class Testweakhashmap_1 {  
    public static void main(String[] args) throws Exception {  
        Map<Object,Object> map = new WeakHashMap<>();
        map.put(null,new byte[5*1024*928]);
        int i = 1;
        while(true)
        {
            System.out.println();
            TimeUnit.SECONDS.sleep(2);
            System.out.println(map.size());
            System.gc();
            System.out.println("==================第"+i+++"次GC结束====================");
        }
    }
}  