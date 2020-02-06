package com.architecture.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static String process(HttpServletRequest req) {
		switch (req.getRequestURI()) {
		case "/ArchitectureProject/create.go":
			return CreateController.create(req);	
		default:
			return"";
		}
	}
	
	public static void directProcess(HttpServletRequest req, HttpServletResponse resp) {
		switch(req.getRequestURI()) {
		case "/ArchitectureProject/building.xml":
			JaxBController.sendBuildingById(req, resp);
		case "/ArchitectureProject/building.json":
			JacksonController.sendBuilding(req, resp);
			break;
		case "/ArchitectureProject/create.json":
			CreateController.createFromJson(req);
		}
	}
	
}
