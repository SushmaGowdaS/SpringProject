package com.cl.sr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class collegeController {
	
	@Autowired
	private collegeService service;
	
	//Retrieval
	@GetMapping("/college")
	public List<college> list(){
		return service.listAll();
		
	}
	
	//Retrieve By Id
	@GetMapping("/college/{id}")
	public ResponseEntity <college> get(@PathVariable Integer Id) {
		try {
			college college= service.get(Id);
			return new ResponseEntity<college>(college,HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<college>(HttpStatus.NOT_FOUND);

			}
				}
	
	
	//Create
		@PostMapping("/college")
		public void add(@RequestBody college college) {
			service.save(college);
		}
		
		
		//Update
		@PutMapping("/college/{id}")
		public ResponseEntity<?> update( @RequestBody college college, @PathVariable Integer id){
			try {
				college existcollege=service.get(id);
				service.save(college);
				return new ResponseEntity <> (HttpStatus.OK);
			} 
			catch (Exception e) {
				return new ResponseEntity <>(HttpStatus.NOT_FOUND);
				
			}
		}

	//Delete
	@DeleteMapping("/college/{id}")
	public void delete(@PathVariable Integer id){
		service.delete(id);
		
		
		
	}

}
