package home;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee mike = new Employee("Mike", "Smith", 35, 1500);
        Employee nancy = new Employee("Nancy", "Thompson", 49, 2500);
        Employee david = new Employee("David", "Johnson", 29, 1800);
        Employee greg = new Employee("Greg", "Morgan", 41, 2200);
        Employee monica = new Employee("Monica", "Smith", 31, 1300);
        Employee nina = new Employee("Nina", "Kellogg", 35, 1600);
        Employee frank = new Employee("Frank", "Josh", 37, 1900);

        List<Employee> list = new ArrayList<>();
        list.add(mike);
        list.add(nancy);
        list.add(david);
        list.add(greg);
        list.add(monica);
        list.add(nina);
        list.add(frank);

        System.out.println(list);

        //list.sort((x, y) -> (int) (x.getSalary() - y.getSalary()));
        //list.sort((x, y) -> (int) (y.getSalary() - x.getSalary()));
        //list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        list.sort((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()));

        System.out.println(list);
    }

}
