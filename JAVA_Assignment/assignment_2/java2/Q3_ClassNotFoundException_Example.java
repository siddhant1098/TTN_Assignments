package assignment.java2;

public class Q3_ClassNotFoundException_Example {
   public static void main(String[] args) {
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            }catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }
