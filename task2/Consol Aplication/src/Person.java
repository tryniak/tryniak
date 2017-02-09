/**
 * Created by Igor on 08.02.2017.
 */
public class Person {
    private String name;
    private int birthYear;

    public String getName(){
        return this.name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthYear( int birthYear){
        this.birthYear = birthYear;
    }
    public Person() {
        this.name = "";
        this.birthYear = 0;
    }
    public Person (String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public int age(){
        return 2017- this.birthYear;
    }
    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public void output(){
        System.out.println("Person name is " + this.name + "\nAge is " + this.age() + "\nBirth year = " + this.birthYear);
    }
    public void changeName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input("Kot", 1998);
        person2.input("Kotw", 1995);
        person3.input("Kote", 1988);
        person4.input("Kotr", 1990);
        person5.input("Kott", 1993);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}






