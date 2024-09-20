package models;

public class Salesperson extends Employee {
    private static double commission;

    public Salesperson(String id, String firstName, String lastName, int age, double baseSalary, double commission) {
        super(id, firstName, lastName, age, baseSalary);
        Salesperson.commission = commission;
    }

    @Override
    public void addEmployee() {
        // Logic to add employee to database or memory structure
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("Cédula: " + id);
        System.out.println("Nombre: " + firstName + " " + lastName);
        System.out.println("Edad: " + age);
        System.out.println("Salario Base: " + baseSalary);
        System.out.println("Comisión: " + commission);
    }

    @Override
    public double calculateNetSalary() {
        double incentive = (age > 30 && commission < 500) ? 0.50 * 300 : 0;
        return baseSalary + incentive;
    }
}