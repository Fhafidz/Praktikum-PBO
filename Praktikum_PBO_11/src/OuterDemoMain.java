public class OuterDemoMain {
    public static void main (String[] args) {
        //Membuat object OuterDemo
        OuterDemo2 outer = new OuterDemo2();

        //Membuat object InnerDemo
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}