package test.innerclass;

public class TestMain {
 public static void main(String[] args) {
   //外部类对象
  OuterClass out = new OuterClass();   //实例化一个外部类对象
  //成员内部类
  OuterClass.InnerClass in = out.new InnerClass();   //实例化成员内部类对象
  //静态内部类
  OuterClass.StaticInnerClass staticIn = new OuterClass.StaticInnerClass();  //实例化静态内部类对象
  //局部内部类
  out.test();              //由于局部内部类只需直接在声明完后就直接就在该方法内实例化对象,故可以直接调用
  //匿名内部类
  out.test1();
 }
  
}