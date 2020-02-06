package com.architecture.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.architecture.model.Building;
import com.architecture.service.CreateService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateController {

	public static String create(HttpServletRequest req) {
		String name = req.getParameter("building_name");
		int id = Integer.parseInt(req.getParameter("owner_id"));
		CreateService.create(name, id);
		return "index.html";
	}
	
	//Turns JSON back into Readable Java Object
	public static void createFromJson(HttpServletRequest req) {
		ObjectMapper om = new ObjectMapper();
		String line ="";
		String temp;
			try {
			while((temp = req.getReader().readLine())!=null){
				line+=temp;
			}
			Building b =om.readValue(line, Building.class);
			System.out.println(b);
					
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
