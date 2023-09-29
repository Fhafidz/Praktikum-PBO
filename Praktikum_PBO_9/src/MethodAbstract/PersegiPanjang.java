package MethodAbstract;

public class PersegiPanjang extends methodAbstract {

    int a = 2;
    int b = 4;

    public int luas() {
        return a*b;
    }

    public int keliling() {
        return 2*(a+b);
    }
}