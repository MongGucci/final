package app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.models.AdminDao;

@Controller
@RequestMapping("/admin/employee")
public class AdminController {
	
	@Autowired
	AdminDao dao;
	@GetMapping("/add.do")
	public String addHandle(ModelMap map){
		map.put("depart",dao.getDepart());
		map.put("position",dao.getPosition());
		System.out.println(map);
		return "admin.employee.add";
	}
	
	@PostMapping("/add.do")
	public String regHandle(@RequestParam Map map) {
		
		System.out.println(map);
		int seq = dao.getSeq();
		System.out.println(seq);
		String id = "em" + seq;
		System.out.println(id);
		map.put("id", id);
		System.out.println(map);
		int r = dao.setEmployee(map);
		System.out.println(r);
		
		return "admin.employee.register";
		
		
	}
 
}
