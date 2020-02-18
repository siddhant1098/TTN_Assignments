public class Q9_Enum_Method{
    enum House_Details {
        Sharma_House(100000), Bindal_house(900000), Chikara_House(1200000), Dhingra_House(1500000);

        int price;

        House_Details(int p) {

            price = p;
        }

        int getPrice() {

            return price;
        }
    }
    public static void main(String[] args){

        for (House_Details tmp : House_Details.values())
            System.out.println(tmp + " costs " + tmp.getPrice() + " rupees.");
    }
}