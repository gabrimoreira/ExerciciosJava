package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		
		List<Employee> employees = new ArrayList();
		
		System.out.println("Put the file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){  
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				Employee employee = new Employee(name,email,salary);
				employees.add(employee);
				line = br.readLine();
			}
			System.out.println("Enter the value: ");
			double salary = sc.nextDouble();
			List <String> emails = employees.stream()
					.filter(e -> e.getSalary() > salary).
					map(e->e.getEmail()).
					sorted()
					.collect(Collectors.toList());
			
			System.out.println("Employees sorted with  a salary bigger than: " + salary);
			emails.forEach(System.out::println);
			
			double sum = employees.stream()
					.filter(e->e.getName().charAt(0) == 'M')
					.map(e-> e.getSalary())
					.reduce(0.0,(e1,e2) -> e1 + e2);
			System.out.println("Sum of salary from people whose name starts with 'M': " + sum);
		}catch(IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
