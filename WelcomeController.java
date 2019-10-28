package com.db.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
		return ModelAndView("Welcome","msg","welcome to spring");
	}

}
