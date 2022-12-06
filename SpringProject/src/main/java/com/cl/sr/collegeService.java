package com.cl.sr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class collegeService {

	@Autowired
	private collegeRepository repository;
	
	public List<college> listAll(){
		return repository.findAll();
		}
	
	public college get(Integer id) {
		return repository.findById(id).get();
		
	}
	
	public void save(college college ) {
		repository.save(college);	
		
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	
}

