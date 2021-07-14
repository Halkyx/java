public abstract class Employee {
    int id;
    String name;
    int age;
    long basicSalary;
    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }
    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name + ", Age: " + this.age + ", Basic Salary: " + this.basicSalary;
    }
}
