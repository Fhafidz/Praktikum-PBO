package ObjectCA;

abstract class AbstrakClass {
    int a;
    int b;
    int c;

    public AbstrakClass (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int kali () {
        return a*b*c;
    }
    
}
