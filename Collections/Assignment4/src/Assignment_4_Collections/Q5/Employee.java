package Assignment_4_Collections.Q5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private double age, salary;
    private String name;

    Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        String s = getClass().getSimpleName() + "[age=" + age + ", salary=" + salary + ", name=" + name + "]";
        return s;
    }


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(21, 500000, "Vipul"));
        employees.add(new Employee(21, 100000, "Siddhant"));
        employees.add(new Employee(22, 400000, "Devansh"));
        employees.add(new Employee(23, 700000, "Jay"));

        employees.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.salary - o1.salary);
            }
        });

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
