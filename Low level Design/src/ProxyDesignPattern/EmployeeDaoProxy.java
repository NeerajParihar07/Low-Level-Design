package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImple();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // TODO Auto-generated method stub
        if(client.equals("ADMIN")){
            employeeDao.create(client, obj);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        // TODO Auto-generated method stub
        if(client.equals("ADMIN")){
            employeeDao.delete(client, empId);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        // TODO Auto-generated method stub
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDao.get(client, empId));
        }

        throw new Exception("Access Denied");
    }

    
}
