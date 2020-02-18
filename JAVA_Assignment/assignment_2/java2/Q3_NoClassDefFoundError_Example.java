package assignment.java2;
class A{
    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

public class Q3_NoClassDefFoundError_Example {

    public static void main(String[] args) {
        A a = new A();
    }
}