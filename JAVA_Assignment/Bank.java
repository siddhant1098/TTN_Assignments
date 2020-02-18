public class Bank {
    public void get_details() {
        String head="Details of Banks :";
        System.out.println(head);
    }
}
    class SBI extends Bank {
        public void get_details() {

            String name = "SIDDHANT SHARMA";
            int number = 987654321;
            int balance = 90000000;
            System.out.println("\nInterest Rate: 6%");
            System.out.println("Account_Number :" + number);
            System.out.println("Account_Holder_Name :" + name);
            System.out.println("Account Holder_Balance :" + balance);
        }
    }

    class BOI extends Bank {
        public void get_details() {
            String name = "VIPUL CHIKARA";
            int number = 987321654;
            int balance = 70000000;
            System.out.println("\nInterest Rate: 7%");
            System.out.println("Account_Number :" + number);
            System.out.println("Account_Holder_Name :" + name);
            System.out.println("Account Holder_Balance :" + balance);
        }
    }
     class ICICI extends Bank {
         public void get_details() {
             String name = "DEVANSH BINDAL";
             int number = 986532147;
             int balance = 80000000;
             System.out.println("\nInterest Rate: 8%");
             System.out.println("Account_Number :" + number);
             System.out.println("Account_Holder_Name :" + name);
             System.out.println("Account Holder_Balance :" + balance);
         }

     }
     class Caller{

        public static void main(String[] args) {
            Bank d = new Bank();
            Bank b = new BOI();
            Bank s = new SBI();
            Bank i = new ICICI();
            d.get_details();
            b.get_details();
            s.get_details();
            i.get_details();
        }
    }



