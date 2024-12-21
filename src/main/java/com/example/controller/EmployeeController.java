package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value ="/")
    public String viewHomePage(Model model) {
//        model.addAttribute("allemplist", );
		List<Employee> employees = service.getAllEmployees();
		model.addAttribute("employees", employees);
        return "index";
    }
	
	@GetMapping("/addnew")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "newemployee";
    }
	
//	@GetMapping(value ="/newemployee")
//    public String addNewPage(Model model) {
//        return "newemployee";
//    }
	
	@PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        service.addEmployee(employee);
        return "redirect:/";
    }
	@GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") int id, Model model) {
        Employee employee = service.getEmployeeById(id);
        if(employee == null) {
        	return "redirect:/";
        }
        model.addAttribute("employee", employee);
        return "update";
    }
 
    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") int id) {
        service.deleteEmployeeById(id);
        return "redirect:/";
 
    }
    @GetMapping("/profilePage/{id}")
    public String profilePage(@PathVariable(value = "id") int id, Model model) {
    	Employee employee = service.getEmployeeById(id);
        if(employee == null) {
        	return "redirect:/";
        }
        model.addAttribute("employee", employee);
        return "profile";
    	
    }
	
}
