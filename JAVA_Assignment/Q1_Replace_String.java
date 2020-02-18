public class Q1_Replace_String {
    public  static void main(String[] args){
        String Str = new String("Welcome to ToTheNew This is a class of JAVA_Programming");
        System.out.println("Original String is :-"+ Str);
        System.out.println("Replacing a substring inside a string with other string ");
        System.out.println("New Updated String is:- ");
        System.out.println(Str.replace("ToTheNew", "Company of Big Data"));
    }
}
