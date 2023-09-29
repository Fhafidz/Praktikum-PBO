public class NestedDemo {
    public static void main (String[] args) {

        NestedClass.StaticNestedClass nsc = new NestedClass.StaticNestedClass();
        nsc.info();

        NestedClass nested = new NestedClass();
        
        NestedClass.InnerClass nic = nested.new InnerClass();
        nic.infoProdi();
    }
}