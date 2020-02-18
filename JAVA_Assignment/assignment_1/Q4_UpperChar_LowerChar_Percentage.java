public class Q4_UpperChar_LowerChar_Percentage {
    public static void main(String args[])
    {
        String str = "Big Black Bug Bit A Big Black Dog On His Big Black Nose";
        int upper = 0, lower = 0, digits=0, special = 0;
        int total_length = str.length();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                digits++;
            else
                special++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Percentage of lower case letters: "+(lower*100)/total_length+"%");
        System.out.println("Upper case letters : " + upper);
        System.out.println("Percentage of upper case letters: "+(upper*100)/total_length+"%");
        System.out.println("Digits : " + digits);
        System.out.println("Percentage of digits case letters: "+(digits*100)/total_length+"%");
        System.out.println("Special characters : " + special);
        System.out.println("Percentage of special case letters: "+(special*100)/total_length+"%");
    }
}

