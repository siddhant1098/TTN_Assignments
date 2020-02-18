package assignment.java2;
import java.util.*;

public class Q9_Furniture {
    public interface Furniture {
        public void stressTest();

        public void fireTest();
    }

    public abstract static class Chair implements Furniture {

        public abstract String chairType();

    }

    public abstract static class Table implements Furniture {
        public abstract String tableType();

    }

    public static class MetalChair extends Chair {
        @Override
        public void stressTest() {
            System.out.println("Passed Stress Test");
        }

        @Override
        public void fireTest() {
            System.out.println("Passed Stress Test");

        }

        @Override
        public String chairType() {
            String s = "This is a metal Chair";
            return s;
        }
    }

    public static class MetalTable extends Table {
        @Override
        public void stressTest() {

            System.out.println("Passed Stress Test");
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void fireTest() {
            //To change body of implemented methods use File | Settings | File Templates.
            System.out.println("Passed Fire Test");
        }

        @Override
        public String tableType() {
            //To change body of implemented methods use File | Settings | File Templates.
            String s = "This is a metal Table";
            return s;
        }
    }

    public static class WoodenTable extends Table {
        @Override
        public void stressTest() {
            //To change body of implemented methods use File | Settings | File Templates.
            System.out.println("Failed Stress Test");
        }

        @Override
        public void fireTest() {
            //To change body of implemented methods use File | Settings | File Templates.
            System.out.println("Failed Fire Test");
        }

        @Override
        public String tableType() {
            //To change body of implemented methods use File | Settings | File Templates.
            String s = "This is a Wooden Table";
            return s;
        }
    }

    public static class WoodenChair extends Chair {
        @Override
        public String chairType() {
            String s = "This is a Wooden Chair";
            return s;
        }

        @Override
        public void stressTest() {
            //To change body of implemented methods use File | Settings | File Templates.
            System.out.println("Failed Fire Test");
        }

        @Override
        public void fireTest() {
            //To change body of implemented methods use File | Settings | File Templates.
            System.out.println("Failed Fire Test");
        }
    }

    public static class  MainClass {
        public static void main(String[] args) {
            Chair chair = null;
            Table table = null;
            Scanner input = new Scanner(System.in);
            String str = input.next();
            if (str.toLowerCase().equals("wooden_table")) {
                table = new WoodenTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();

            } else if (str.toLowerCase().equals("metal_table")) {
                table = new MetalTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            } else if (str.toLowerCase().equals("metal_chair")) {
                chair = new MetalChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();
            } else {
                chair = new WoodenChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();
            }


        }
    }

}

