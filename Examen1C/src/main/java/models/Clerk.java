package models;

public class Clerk extends Employee {
    private static String position;

    public Clerk(String id, String firstName, String lastName, int age, double baseSalary, String position) {
        super(id, firstName, lastName, age, baseSalary);
        Clerk.position = position;
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
        System.out.println("Cargo: " + position);
    }

    @Override
    public double calculateNetSalary() {
        double incentive = position.equals("Manager") ? 0.20 * baseSalary : 0.80 * 300;
        return baseSalary + incentive - 0.07 * baseSalary;
}
}