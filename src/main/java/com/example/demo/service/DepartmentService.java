package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public Department saveDeparetment(Department department) {	
		return repository.save(department);
	}
	
	
	public Optional<Department> getDeparetment(Long departmentId) {	
		return repository.findById(departmentId);
	}
	
	public List<Department> getAllDeparetment() {	
		return repository.findAll();
	}
	
}
