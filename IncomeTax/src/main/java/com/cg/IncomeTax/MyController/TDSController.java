package com.cg.IncomeTax.MyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.IncomeTax.Exception.IDNotFoundException;
import com.cg.IncomeTax.Service.TDSService;
import com.cg.IncomeTax.bean.TDSDetails;

@RestController
public class TDSController {

	@Autowired
	TDSService service;
	
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@GetMapping("/user/tds/{id}")
	public TDSDetails getByPid(@PathVariable int id) {
		TDSDetails tdsDetails = service.getById(id);
		if (tdsDetails == null) {
			throw new IDNotFoundException("ID Not Found wrong ID : " + id);
		} else
			return tdsDetails;
	}
}



