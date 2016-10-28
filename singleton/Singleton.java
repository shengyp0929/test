package test.singleton;

public class Singleton {
    private Singleton(){};
    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    public static void testSingleton(){
        System.out.println("CreateString");
    }
}