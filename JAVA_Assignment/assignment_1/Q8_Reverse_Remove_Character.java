public class Q8_Reverse_Remove_Character{
    public static void main(String[] args)
        {
            {

                    StringBuffer input = new StringBuffer("SIDDHANT SHARMA - BIG DATA TRAINEE");
                    System.out.println("String = " + input);
                    StringBuffer input1 = input.reverse();
                    System.out.println("Reverse of String" + input1 );
                    StringBuffer input2 = input1.delete(4, 9);
                    System.out.println("After deletion string buffer is = " + input2);
                }
            }}