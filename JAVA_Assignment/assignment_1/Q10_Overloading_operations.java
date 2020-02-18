public class Q10_Overloading_operations {

    public void add(int a, int b)
    {
        int sum= a+b;
        System.out.println(sum);
    }
    public void add(double a, double b)
    {
        double sum= a+b;
        System.out.println(sum);
    }
    public void mul(float a, float b)
    {
        float flm= a*b;
        System.out.println(flm);
    }
    public void mul(int a, int b)
    {
        int c= a*b;
        System.out.println(c);
    }
    public void concate(String a, String b)
    {
        String con= a+b;
        System.out.println(con);
    }
    public void concate(String a, String b,String c)
    {
        String d= a+b+c;
        System.out.println(d);
    }
    public static void main(String[] args) {
        Q10_Overloading_operations j =new Q10_Overloading_operations();
        j.add (5,8);
        j.add(34,22);
        j.mul(7.8f,6.5f);
        j.mul(5,3);
        j.concate("Hello ", "World");
        j.concate("Hello", "World","!!!");

    }
}
