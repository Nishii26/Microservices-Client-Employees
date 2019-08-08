package com.nish.MicroservicesEurekaClient.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nish.MicroservicesEurekaClient.pojo.Employees;

@RestController
public class EmployeesController {
	
	private static Map<String, List<Employees>> empDB = new HashMap<String, List<Employees>>();
	
	 static {
	        empDB = new HashMap<String, List<Employees>>();
	 
	        List<Employees> lst = new ArrayList<Employees>();
	        Employees emp = new Employees(1,"Nishtha", "gnishtha2695@gmail.com","CSE","F","nishii26","abc","admin");
	        lst.add(emp);
	        emp = new Employees(2,"bum", "bum@gmail.com","CSE","M","bum96","bumabc","employee");
	        lst.add(emp);
	 
	        empDB.put("org1", lst);
	 
	        lst = new ArrayList<Employees>();
	        emp = new Employees(3,"dino", "dino@mail.com","dogy-doggy","m/F","dino","dinoabc","dogy");
	        lst.add(emp);
	 
	        empDB.put("org2", lst);
	 
	    }
	 
	    @RequestMapping(value = "/getEmployees/{orgname}", method = RequestMethod.GET)
	    public List<Employees> getStudents(@PathVariable String orgname) {
	        System.out.println("Getting Employees details for " + orgname);
	 
	        List<Employees> empList = empDB.get(orgname);
	        if (empList == null) {
	        	empList = new ArrayList<Employees>();
	            Employees std = new Employees(0,"Not Found", "N/A","N/A","N/A","N/A","N/A","N/A");
	            empList.add(std);
	        }
	        return empList;
	    }

}
