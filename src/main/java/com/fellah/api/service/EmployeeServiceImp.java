package com.fellah.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellah.api.model.Employee;
import com.fellah.api.model.Fournisseur;
import com.fellah.api.repository.EmployeeRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

	
	

    @Autowired
    private EmployeeRepository emp;
	@Override
	public Employee saveEmp(Employee employee) {
		return emp.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		
		return emp.findAll();
	}
	@Override
	public List<Object> getLastSevenDays(int d) {
	   	LocalDate today=LocalDate.now();

		 LocalDate sevenDaysAgoDate = LocalDate.now().minusDays(d);
	        return this.emp.sevendays(sevenDaysAgoDate,today);

	}
	
	@Override
	public Employee findkarim(Long id) {
		return emp.findkarim(id);
	}

	@Override
	public Employee update(Long id,Employee em) {
		

        if (emp.findById(id).isPresent()){
            Employee employee = emp.findById(id).get();
            if(em.getNom()==""|| em.getPrenom()=="" || em.getAdresse()==""||em.getAge()<=17 || em.getAge()>=99) {
            	return employee;
            }
            employee.setNom(em.getNom());
            employee.setPrenom(em.getPrenom());
            employee.setAdresse(em.getAdresse());
            employee.setAge(em.getAge());
            

            Employee updatedEmp = emp.save(employee);

            return updatedEmp;
        }else{
            return null;
        }
	}

	@Override
	public void delete(Long id) {
			emp.deleteById(id);
	}

	@Override
	public Long allEmp() {
		return emp.all();

	}



	

}
