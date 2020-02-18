package assignment.java2;

public class Q2_SortingString {
    public static void main(String[] args)
    {
        String str = "SiDdHaNt ShArMa";
        char temp = 0;

        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

