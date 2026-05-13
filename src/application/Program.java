package application;

import java.util.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Integer id;
		String name;
		Double salary;
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = scanner.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ":");

			System.out.print("Id: ");
			id = scanner.nextInt();
			
			while (Employee.findEmployee(list, id) != null) {
				System.out.print("Id already exists! Inform another ID: ");
				id = scanner.nextInt();
			}
					
			System.out.print("Name: ");
			scanner.nextLine();
			name = scanner.nextLine();
			System.out.print("Salary: ");
			salary = scanner.nextDouble();
			System.out.println();
			
			Employee employee = new Employee(id, name, salary);
				

			list.add(employee);
		}
		
		System.out.print("Enter the employee Id that will have salary increase: ");
		int idIncrease = scanner.nextInt();
		Employee result = Employee.findEmployee(list, idIncrease);
		
		if (result == null) 
			System.out.println("This id doesn't exist!");
		else {
			System.out.print("Enter the percentage: ");
			double percentage = scanner.nextDouble();
			
			result.increaseSalary(percentage);
			
		}
		
		System.out.println();
		
		
		for (Employee employee : list)
			System.out.println(employee);
		
		
		scanner.close();
	}

}
