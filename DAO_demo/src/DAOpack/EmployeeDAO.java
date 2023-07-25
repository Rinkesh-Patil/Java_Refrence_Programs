package DAOpack;

import business.Employee;

public interface EmployeeDAO 
{
	void insertEmployee(Employee ref);
	Employee getEmployee();
}
