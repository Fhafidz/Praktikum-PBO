public class OuterDemo {
    int num;

    //inner class
    private class InnerDemo {
        private void print() {
            System.out.println("ini merupakan method inner class");
        }
    }

    //akses method inner class dari method outer class
    void displayInner() {
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}