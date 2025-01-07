package ProxyDesignPattern;

public class EmployeeDaoImple implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("create a new row in the employee table");
    }

    @Override
    public void delete(String client, int empId)throws Exception {
        // TODO Auto-generated method stub
        System.out.println("deleted row with employeeId" + empId);   
    }

    @Override
    public EmployeeDo get(String client, int empId)throws Exception {
        // TODO Auto-generated method stub
        System.out.println("fetching data from the DB");
        return new EmployeeDo();
    }
}
