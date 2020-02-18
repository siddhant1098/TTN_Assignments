public class Q7_Static_Keyword{
    static int Age = 21;

    static {
        String FirstName = "Siddhant";
        System.out.println(FirstName);
    }

    public static void LastName() {
        String lastName = "Sharma";
        System.out.println(lastName);
    }

    public static void main(String args[]) {
        LastName();
        System.out.println(Age);

    }
}