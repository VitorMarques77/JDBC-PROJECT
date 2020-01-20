package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dd = DaoFactory.createDepartmentDado();
		Department obj = new Department(null, "Music");
		System.out.println("=== TEST 1: department insert ===");
		dd.insert(obj);
		System.out.println("Inserted! New Id = "+obj.getId());
		
		
		System.out.println();
		System.out.println("=== TEST 2: department findById ===");
		Department dp2 = dd.findById(3);
		System.out.println(dp2);
		
		System.out.println();
		System.out.println("=== TEST 3: department update ===");
		Department dp3 = dd.findById(1);
		dp3.setName("Culture");
		
		
		System.out.println();
		System.out.println("=== TEST 4: department deleteById ===");
		dd.deleteById(7);
		
		System.out.println();
		System.out.println("=== TEST 5: department findAll ===");
		dd.findAll().forEach(System.out::println);;
		
		DB.closeConnection();
		
	}
}
