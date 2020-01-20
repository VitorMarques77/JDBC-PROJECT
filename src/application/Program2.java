package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dd = DaoFactory.createDepartmentDado();
		Department obj = new Department(null, "Music");
		dd.insert(obj);
		System.out.println("=== TEST 1: department insert ===");
		System.out.println("Inserted! New Id = "+obj.getId());
		
		
	}
}
