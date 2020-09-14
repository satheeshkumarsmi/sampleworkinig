package com.example.smi.demoweb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ReceiveController {
	
	@RequestMapping(value="/getData",produces = "application/json",method=RequestMethod.GET)
	public Iterable<String> getData(){
		List<String> l=new ArrayList<String>();
		l.add("name");
		l.add("password");
		l.add("mailid");
		l.add("mobile number");
		return l;
	}
	
	@RequestMapping(value="/getDataMap",produces = "application/json",method=RequestMethod.GET)
	public Map<String,String> getDataMap(){
		Map<String, String> map=new HashMap<String, String>();
		map.put("username", "welcome");
		map.put("role","administrator");
		return map;
	}
	public static void main() {
		
	}
	

}
