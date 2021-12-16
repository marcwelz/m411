public class Application {

    public static void main(String[] args) {
        EmployeePersistence employeePersistence = new EmployeePersistence();
        System.out.println(employeePersistence.getAllEmployees());
    }
}
