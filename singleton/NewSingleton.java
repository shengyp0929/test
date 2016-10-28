package test.singleton;


public class NewSingleton {

    private NewSingleton(){
    };

    private static class HolderSingleton{
        private static final NewSingleton Instance = new NewSingleton();
    };

    public static NewSingleton getInstance(){
        System.out.println("get singleton");
        return HolderSingleton.Instance;
    };

    public static void main(String[] args) throws Exception {
        NewSingleton.getInstance();
    }
}
