package assignment.java2;

public class Q13_Custom_Exception {
    class InvalidAgeException extends Exception {
        InvalidAgeException(String s) {
            super(s);
        }
    }
    public static class Vote_Crieteria {
        public static void validate(int age) throws InvalidAgeException {
            if (age < 18) {
                System.out.println("Not Valid Age for Voting");
                } else {
                System.out.println("Valid Age to Vote");
                }
            }

            public static void main(String args[]) {
            try {

                validate(25);
            } catch (Exception m) {
                System.out.println("Exception occured: " + m);
            }
        }
    }
}
