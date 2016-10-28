package test.innerclass;

public class OuterClass {
    // 成员内部类
    public class InnerClass {

    }
    // 静态内部类--成员内部类特例
    public static class StaticInnerClass {

    }

    public void test() {
        // 局部内部类
        class InnerClass {
            public void world() {
                System.out.println("hello, inner");
            }
        }
        InnerClass inn = new InnerClass();
        inn.world();

        // 再定义一个局部内部类
        class Inner1Class {
            public void holle() {
            }
        }
        Inner1Class inn1 = new Inner1Class();
        inn1.holle();
    }

    public void test1() {
        // 匿名内部类
        new Object() {
            public void hello() {
                System.out.println("Hello World!");
            }
            public void hello1() {
                System.out.println("Hello another World!");
            }
        }.hello1();
    }
}