public class Waiter extends Employee {
    int id;
    String name;
    int age;
    long basicSalary;
    long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
    }
    public long calculatorSalary() {
        long Salary = basicSalary + compensate;
        return Salary;
    }
    
}
