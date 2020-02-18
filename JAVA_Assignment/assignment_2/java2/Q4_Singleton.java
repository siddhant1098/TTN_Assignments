package assignment.java2;

public class Q4_Singleton {
        private static Q4_Singleton singleton = new Q4_Singleton();
        private Q4_Singleton() { }
        public static Q4_Singleton getInstance( ) {
            return singleton;
        }
        protected static void get_data( ) {
            System.out.println("This is the question of Singleton");
        }

    public static void main(String[] args) {
        Q4_Singleton tmp = Q4_Singleton.getInstance();
        Q4_Singleton.get_data();
    }
}
