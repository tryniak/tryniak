import java.util.Scanner;


public class Employee {
    private String name;
    private  DepartmentName departmentName;
    private int salary;

    public String getName() {return this.name;}
    public String getDepartmentNameName() {return this.name;}
    public int getSalary () {return this.salary;}
    public void setName(String name){this.name = name;}
    public void setDepartmentName(DepartmentName departmentName){this.departmentName = departmentName;}
    public void setName(int salary){this.salary = salary;}

    public Employee( String name, DepartmentName departmentName, int salary) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }
    public enum DepartmentName { Economic, Accounting, It};

    public static void employeesOfDepartment(Employee[] array, String departmentName){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (departmentName.equals(array[i].departmentName.toString())){
                System.out.println(array[i]);
                j++;
            }
        }
        if (j == 0) System.out.println("Nothing found");
    }

    public static void arrangeAscending(Employee[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].salary > array[j + 1].salary){
                    Employee max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }
            }
        }
        System.out.println("Sort by ascending salary");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    public static void arrangeDescending(Employee[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].salary < array[j + 1].salary) {
                    Employee min = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = min;
                }
            }
        }
        System.out.println("Sort by descending salary");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public String toString(){
        return ("Name is " + this.name + ", Department is " + this.departmentName + " Salary is " + this.salary );
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Ivan", DepartmentName.It, 1300);
        arr[1] = new Employee("Sasha", DepartmentName.Accounting, 1400);
        arr[2] = new Employee("Oleg", DepartmentName.Accounting, 1100);
        arr[3] = new Employee("Olena", DepartmentName.Economic, 1770);
        arr[4] = new Employee("Goga", DepartmentName.Accounting, 13300);

        System.out.println("Input name department");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Employee.employeesOfDepartment(arr, name);
        Employee.arrangeAscending(arr);
        Employee.arrangeDescending(arr);
    }
}
