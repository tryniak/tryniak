/**
 * Created by Igor on 08.02.2017.
 */
public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalHours;

    public String getName() {
        return this.name;
    }

    public int getRate() {
        return this.rate;
    }

    public int getHours() {
        return this.hours;
    }

    public int getTotalHours() {
        return Employee.totalHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        if (this.hours != 0) Employee.totalHours -= this.hours;
        this.hours = hours;
        Employee.totalHours += hours;
    }


    public Employee() {
        this.name = "";
        this.hours = 0;
        this.rate = 0;
    }

    public Employee(String name, int rate) {
        this.setName(name);
        this.hours = 0;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.setName(name);
        this.hours = hours;
        this.rate = rate;
        Employee.totalHours += hours;
    }

    public int salary(){
        return this.hours * this.rate;
    }
    public void changeRate(int rate){
        this.setRate(rate);
    }
    public double bonuses(){
        return 0.15 * this.salary();
    }
    @Override
    public String  toString(){
        return ("name is " + this.name + "\nhours = " + this. hours + "\nrate = " + this.rate);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vasia", 5, 15);
        Employee employee2 = new Employee("Kolia", 5, 12);
        Employee employee3 = new Employee("Goga", 2, 56);
        System.out.println(employee1+ "\n"+ employee2 + "\n"+ employee3 );
        System.out.println(Employee.totalHours);
        System.out.println(employee1.bonuses());
    }

}
