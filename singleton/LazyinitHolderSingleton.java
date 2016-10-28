package test.singleton;

public class LazyinitHolderSingleton {
    private LazyinitHolderSingleton(){
        System.out.println("LazyinitSingleton");
    };

    private static class SingletonHold{
        private static final LazyinitHolderSingleton INSTANCE = new LazyinitHolderSingleton();
    }

    public static LazyinitHolderSingleton getInstance(){
        System.out.println("get singleton");
        return SingletonHold.INSTANCE;
    }
    
    public static void main(String[] args) throws Exception {
        LazyinitHolderSingleton.getInstance();
    }
}
