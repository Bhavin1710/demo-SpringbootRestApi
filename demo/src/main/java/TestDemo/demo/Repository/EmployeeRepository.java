package TestDemo.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TestDemo.demo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
