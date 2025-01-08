package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double grade;
    String address;
    String job;

    public Person() {
        System.out.println("Created Person");
    }
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double grade, String address, String job){
        this(firstName,lastName,age);
        this.grade = grade;
        this.address = address;
        this.job = job;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        return age>=13 && age<=19   ;
    }
    public String toString(){
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("Lastname: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}



