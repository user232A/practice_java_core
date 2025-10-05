package practice_5.treemap_tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    // Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

    public static String getNextID(TreeMap<Integer, Employee> treeMap, Integer id){

        if (treeMap.containsKey(id)){
            if (treeMap.higherKey(id) != null){
                return "Ближайшее большее: " + treeMap.higherKey(id);
            } else {
                return Integer.toString(id);
            }
        }

        return "Такого работника с id " + id + " нет";
    }

    public static void main(String[] args) {

        TreeMap<Integer, Employee> treeMap = new TreeMap<>();
        Employee emp1 = new Employee(4, "Masha", 34);
        Employee emp2 = new Employee(7, "Misha", 29);
        Employee emp3 = new Employee(3, "Kolya", 30);
        Employee emp4 = new Employee(15, "Lena", 25);
        Employee emp5 = new Employee(41, "Fedor", 39);

        treeMap.put(4, emp1);
        treeMap.put(7, emp2);
        treeMap.put(3, emp3);
        treeMap.put(15, emp4);
        treeMap.put(41, emp5);

        System.out.println(getNextID(treeMap, 7));
    }
}

class Employee {
    private String name;
    private Integer age;
    private final Integer ID;

    public Employee(Integer ID, String name, Integer age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
