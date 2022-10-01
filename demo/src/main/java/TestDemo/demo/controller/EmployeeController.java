package TestDemo.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TestDemo.demo.Model.Employee;
import TestDemo.demo.Repository.EmployeeRepository;

@RestController
@RequestMapping("api")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("all")
	public List<Employee> findAll(){
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		return employees;
	}
	
	@PostMapping("add")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeRepository.save(employee);
	}
	
	@GetMapping("emplyee/{id}")
	public Optional<Employee> getEmployeeId(@PathVariable int id){
		return employeeRepository.findById(id);
	}
	
	@PutMapping("update/{id}")
	public Employee updateStudent(@RequestBody Employee employee){
		return employeeRepository.save(employee);
		
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable int id) {
    employeeRepository.deleteById(id);
 }

	
} 
