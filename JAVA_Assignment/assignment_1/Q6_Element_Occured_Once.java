public class Q6_Element_Occured_Once {
    public static void Using_XOR(int[] a) {
        if (a.length == 0)
            return;
           int xor = a[0];
           for (int i = 1; i <a.length ; i++) {
                xor ^= a[i];
            }
            System.out.println("Element appear only once in array is  - " + xor);
        }


    public static void main(String[] args) {
        int[] a = {1, 5, 6, 2, 1, 6, 4, 3, 2, 5, 3};
        Using_XOR(a);
    }
}
