package models;

public class DeliveryPerson extends Employee {
    private static String zone;

    public DeliveryPerson(String id, String firstName, String lastName, int age, double baseSalary, String zone) {
        super(id, firstName, lastName, age, baseSalary);
        DeliveryPerson.zone = zone;
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
        System.out.println("Zona de reparto: " + zone);
    }

    @Override
    public double calculateNetSalary() {
        return (zone.equals("Ciudad Sandino") ? baseSalary + 300 : baseSalary) - 0.10 * baseSalary;
    }
}