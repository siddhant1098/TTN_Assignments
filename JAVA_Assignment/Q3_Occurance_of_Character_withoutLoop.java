public class Q3_Occurance_of_Character_withoutLoop{
    public static void main(String[] args)
    {
        String str = "Big black bug bit a big black dog on his big black nose";
        int count = str.length() - str.replace("b", "").length();
        System.out.println("Number of occurances of 'b' in "+" = "+count);
    }
}

