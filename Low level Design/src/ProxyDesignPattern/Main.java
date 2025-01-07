package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new EmployeeDo());
            System.out.println("OP Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
